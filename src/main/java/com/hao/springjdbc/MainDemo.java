package com.hao.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hao.springjdbc.bean.Department;
import com.hao.springjdbc.dao.DepartmentDAO;

public class MainDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
		DepartmentDAO deptDAO = (DepartmentDAO)context.getBean("departmentDAO");
		List<Department> departments = deptDAO.queryDepartment();
		for(Department dept:departments) {
			System.out.printf("Dept(ID,No,Name): %d,%s,%s\n", dept.getDeptId(), dept.getDeptNo(), dept.getDeptName());
		}
	}

}
