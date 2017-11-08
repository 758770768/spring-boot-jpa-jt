package org.springboot.jpa.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springboot.jpa.pojo.Emp;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleDemoController {
	
	@Resource
	private JdbcTemplate jt;
	
	
	@RequestMapping("/")
	public String hello(){
		return "index";
	}

	/**
	 * 下午8:44:35 2017年11月7日
	 * 查询
	 */
	@RequestMapping("/list")
	public List<Emp> hello1(){
		String sql="select * from emp ";
		// jdbcTemple 查询
		List<Emp> el = jt.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
		System.out.println(el);
		return el;
	}

	
	/**
	 * 下午9:00:53 2017年11月7日
	 * 添加
	 */
	 @RequestMapping("/add")
	public String add(){
		String sql="insert into emp values(?,?,?,?,?,?)";
		// jdbcTemple 查询
         jt.update(sql, "A0012","十年生死","1998-1-12","M","古隆中","A01");
		return "123";
	}

	/**
	 * 下午9:00:44 2017年11月7日
	 * 更新
	 */
	 @RequestMapping("/update")
	public String update(){
		String sql="update emp set ename=?,sex=?,city=? where eid=?";
		// jdbcTemple 查询
		jt.update(sql, "两茫茫","M","寂寞沙洲","A0012");
		return "ok";
	}
	
	
	@RequestMapping("/erro")
	public String sorry(){
		return "sorry";
	}

	//restful 风格请求
	@RequestMapping(value="/put",method=RequestMethod.PUT)
	public String put(String eid){
		return eid;
	}

	
	
	
}
