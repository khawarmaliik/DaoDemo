package com.emp.management.main;

import com.emp.management.dao.EmployeeDao;
import com.emp.management.dao.EmployeeDaoImpl;
import com.emp.management.entity.Employee;

public class GetEmp {
		 Employee getEmp(int id) {
		 EmployeeDao employeeDao= new EmployeeDaoImpl();
		 Employee emp = employeeDao.getEmployee(id);
		 System.out.println("Name of Employee is " + emp.getName());
		 return emp;
		 }
}
