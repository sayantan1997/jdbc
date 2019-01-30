package com.pack.service;

import com.pack.dao.EmployeeDAO;
import com.pack.model.Employee;

public class EmployeeBO {
public static int insertEmployee(Employee e) throws Exception
{
	int i=EmployeeDAO.insertEmployee(e);
	return i;
}
}
