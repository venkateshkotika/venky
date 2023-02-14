package com.example.slokam;


import java.util.List;


import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookcontroller {
	
	@Autowired
	private bookrepo jp;
	@PostMapping("savebook")
	public book savebook(@RequestBody book book)
	{
		System.out.println("book=="+book);
		jp.save(book);
		return book;
		
	}
	
	@PostMapping("savealldata")
	public List<book> savealldata(@RequestBody List<book> book)
	{
		System.out.println("listbook----"+book);
		List<book> b= jp.saveAll(book);
		return b;
		
	}
	
	
	
	 
	 
	
	 
	 
	 
	
	
	
	
	
}
