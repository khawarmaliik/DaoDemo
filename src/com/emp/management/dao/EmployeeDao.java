package com.emp.management.dao;
import java.util.List;

import com.emp.management.entity.Employee;

public interface EmployeeDao {
	public void createEmp(Employee emp);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployee();
	public boolean deleteEmp(int id);
	public void updateEmp(Employee emp);
}
