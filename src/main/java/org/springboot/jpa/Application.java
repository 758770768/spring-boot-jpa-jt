package org.springboot.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springboot.jpa.controller.EmpController;
import org.springboot.jpa.dao.EmpDaoI;
import org.springboot.jpa.pojo.Emp;
import org.springboot.jpa.service.EmpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Application {

	@Resource
	private EmpDaoI ed;
	@Resource
	private EmpService es;
	
	public static void main(String[] args) {
                 SpringApplication.run(new Object[]{Application.class,EmpController.class}, args);	
	}
	
	
	@RequestMapping("/view/{name}")
	public String view(@PathVariable String name){
		
		return name;
	}

	@RequestMapping("/test")
	@ResponseBody
	public List<Emp> test(){
		//List<Emp> el = ed.findAll();
		List<Emp> el = es.query();
		return el;
	}
	
	
	
	
}
