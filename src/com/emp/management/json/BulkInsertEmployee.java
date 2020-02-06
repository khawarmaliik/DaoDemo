package com.emp.management.json;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BulkInsertEmployee {

    public List<JsonObject> getEmployeeJson() {
    	

        String fileName = "D:\\records.json";
        Path path = Paths.get(fileName);
        ArrayList<JsonObject> myList = new ArrayList<>();

        try (Reader reader = Files.newBufferedReader(path,StandardCharsets.UTF_8)) {

            JsonParser parser = new JsonParser();
            JsonElement tree = parser.parse(reader);

            JsonArray array = tree.getAsJsonArray();
            

            for (JsonElement element: array) {

                if (element.isJsonObject()) {
                	JsonObject emp = element.getAsJsonObject();

                    emp.get("id").getAsLong();
                    emp.get("name").getAsString();
                    emp.get("age").getAsLong();
                    emp.get("city").getAsString();
                    emp.get("designation").getAsString();
                    emp.get("email").getAsString();
                    emp.get("contact").getAsString();
                    myList.add(emp);
                    
                }
            }
        }
        catch (FileNotFoundException e) {
        	e.printStackTrace();
        }
        catch (IOException e) {
        	e.printStackTrace();
        }
        return (myList);
    }
}