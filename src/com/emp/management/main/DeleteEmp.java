package com.emp.management.main;

import com.emp.management.dao.EmployeeDao;
import com.emp.management.dao.EmployeeDaoImpl;

public class DeleteEmp {
	
		 void deleteEmp() {
		 EmployeeDao employeeDao= new EmployeeDaoImpl();
		 employeeDao.deleteEmp(98);
		 
	}
}
