package com.emp.management.main;

import java.util.List;

import com.emp.management.dao.EmployeeDao;
import com.emp.management.dao.EmployeeDaoImpl;
import com.emp.management.entity.Employee;
import com.emp.management.json.BulkInsertEmployee;
import com.google.gson.JsonObject;

public class CreateEmployee {
		 void createEmp() {
		 EmployeeDao employeeDao= new EmployeeDaoImpl();
		 Employee emp = new Employee(8,"Ali",43,"sad","asd","asdas","asdasd");
		 employeeDao.createEmp(emp);
		 }
		 
		 void createEmpFromJson() {
			 BulkInsertEmployee bulkInsertEmployee = new BulkInsertEmployee();
				List<JsonObject> myList= bulkInsertEmployee.getEmployeeJson();
				for(JsonObject employee : myList) {
					EmployeeDao employeeDao= new EmployeeDaoImpl();
					 Employee emp = new Employee(employee.get("id").getAsInt(),employee.get("name").getAsString(),employee.get("age").getAsInt(),employee.get("city").getAsString(),employee.get("designation").getAsString(),employee.get("email").getAsString(),employee.get("contact").getAsString()); 
					 employeeDao.createEmp(emp);
				}
				
		 }
		 }