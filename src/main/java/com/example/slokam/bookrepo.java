package com.example.slokam;


import java.awt.print.Book;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookrepo extends JpaRepository<book, Integer> {
	
	public abstract List<book> findByBname(String bname);
	//public abstract List<book> findBybnameAndbcost(String bname,int bcost);
	
	
	
}
