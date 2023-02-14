package com.example.slokam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class curdoperation {
	
	@Autowired
	private bookrepo br;
	
	@GetMapping("getbyname")
	public List<book> getbyname(@PathVariable(name="bname") String bname)
	{
		System.out.println("bname==="+bname);
		List<book>b=	br.findByBname(bname);
		return b;
	}

}
