package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.pack.JDBCConnection;
import com.pack.model.Employee;

public class EmployeeDAO {
	public static int insertEmployee(Employee e) throws Exception
	{
		Connection con=JDBCConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("Insert into employee values(?,?,?,?,?)");
		ps.setInt(1, e.getId());
		ps.setString(2, e.getName());
		ps.setFloat(3, e.getSalary());
		java.sql.Date d1=new java.sql.Date(e.getDob().getTime());
		ps.setDate(4, d1);
		ps.setString(5, e.getDesig());
		int i=ps.executeUpdate();
		con.close();
		return i;
	}


}
