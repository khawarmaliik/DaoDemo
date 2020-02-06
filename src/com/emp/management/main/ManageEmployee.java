package com.emp.management.main;

public class ManageEmployee {
	
	
	public static void main(String[] args){
		
		
		//get jsonfile data
//		GetJsonData jsonData = new GetJsonData();
//		jsonData.getJsonData();
		
		 CreateEmployee emp = new CreateEmployee();
		 emp.createEmpFromJson();
		
		
//		//create user
//		 CreateEmployee emp = new CreateEmployee();
//		 emp.createEmp();
//		
//		//get employee by ID
//		GetEmp emp1 = new GetEmp();
//		emp1.getEmp(42);
//		
//		//get all Records
//		GetAllEmp getAllEmp = new GetAllEmp();
//		getAllEmp.getAllEmp();
//		
//		//delete employee by id
//		DeleteEmp delete = new DeleteEmp();
//		delete.deleteEmp();
//		
//		
//		//update record
//		UpdateEmp updateEmp = new UpdateEmp();
//		updateEmp.updateEmp();
	}

}
