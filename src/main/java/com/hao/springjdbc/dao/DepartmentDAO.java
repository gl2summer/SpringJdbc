package com.hao.springjdbc.dao;

import java.util.List;

import com.hao.springjdbc.bean.Department;

public interface DepartmentDAO {

	public List<Department> queryDepartment()throws Exception;
}
