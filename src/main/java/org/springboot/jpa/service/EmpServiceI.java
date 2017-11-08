package org.springboot.jpa.service;

import java.util.List;

import javax.annotation.Resource;

import org.springboot.jpa.dao.EmpDaoI;
import org.springboot.jpa.pojo.Emp;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceI implements EmpService{

	@Resource
	private EmpDaoI ed;

	@Override
	public List<Emp> query() {
		// TODO Auto-generated method stub
		List<Emp> el = ed.findAll();
		return el;
	}
	
	
	
	
}
