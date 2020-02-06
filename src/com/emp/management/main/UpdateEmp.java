package com.emp.management.main;

import com.emp.management.dao.EmployeeDao;
import com.emp.management.dao.EmployeeDaoImpl;
import com.emp.management.entity.Employee;

public class UpdateEmp {
	public void updateEmp() {
		 EmployeeDao employeeDao= new EmployeeDaoImpl();
		 GetEmp getEmp = new GetEmp();
		 Employee emp = getEmp.getEmp(42);
		 emp.setName("Akbar");
		 employeeDao.updateEmp(emp);
		 }
}
