package org.springboot.jpa.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springboot.jpa.pojo.Emp;
import org.springboot.jpa.service.EmpServiceI;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@SpringBootApplication
public class EmpController {

	@Resource
	 private EmpServiceI es;
	
	
	@RequestMapping("/emp/query")
	public List<Emp> query(){
		
		
		List<Emp> el = es.query();
		return el;
		
	}
	
	
}
