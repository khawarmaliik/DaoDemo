package com.emp.management.main;

import java.util.List;

import com.emp.management.dao.EmployeeDao;
import com.emp.management.dao.EmployeeDaoImpl;
import com.emp.management.entity.Employee;

public class GetAllEmp {
		 void getAllEmp() {
		 EmployeeDao employeeDao= new EmployeeDaoImpl();
		 List<Employee> myList = employeeDao.getAllEmployee();
		 System.out.println("Total Number of Employees are "+myList.size());
		 for(Employee employee : myList) {
			 System.out.println(employee.getName());
		 }
		 }
}
