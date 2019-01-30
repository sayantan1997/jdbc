package com.pack;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.pack.model.Employee;
import com.pack.service.EmployeeBO;
public class Main
{	
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("###Employee###");
		System.out.println("Menu");
		System.out.println("1. Add Employee");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. View");
		System.out.println("5. Exit");
		int ch; String name="";
		float sal=0.0f; String dob="",desig="";
		do
		{
			System.out.println("enter choice");
			ch=sc.nextInt();
			sc=new Scanner(System.in);
			switch(ch)
			{
			case 1:
				System.out.println("Enter Name - ");
				name=sc.nextLine();
				System.out.println("Enter salary - ");
				sal=Float.parseFloat(sc.nextLine());
				System.out.println("Enter DOB - ");
				dob=sc.nextLine();
				System.out.println("Enter Designation - ");
				desig=sc.nextLine();
				Random x=new Random();
				int num =x.nextInt(900000)+100000;
				SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
				sdf.setLenient(false);     //wrong i/p then it will throw a exception
				Date d=null;
				try
				{
					d=sdf.parse(dob);
				}
				catch(ParseException p)
				{
					System.out.println(p);
				}
				Employee e=new Employee(num,name,sal,d,desig);
				int i=EmployeeBO.insertEmployee(e);
				if(i==1)
					System.out.println("Employee inserted successfully !");
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				break;
			case 5:
				System.exit(0);
				break;
			default :
				System.out.println("invalid");
			}
		}
			while(ch!=0 && ch<5);
		
		sc.close();
	}
}
