package com.emp.management.main;

import com.emp.management.json.BulkInsertEmployee;
import com.google.gson.JsonObject;

import java.util.List;


public class GetJsonData {
		void getJsonData() {
		BulkInsertEmployee bulkInsertEmployee = new BulkInsertEmployee();
		List<JsonObject> myList= bulkInsertEmployee.getEmployeeJson();
		for(JsonObject employee : myList) {
			 System.out.println(employee.get("name").getAsString());
			 }
		}
		}
