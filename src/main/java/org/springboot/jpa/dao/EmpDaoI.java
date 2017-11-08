package org.springboot.jpa.dao;

import org.springboot.jpa.pojo.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpDaoI extends JpaRepository<Emp, String>{

}
