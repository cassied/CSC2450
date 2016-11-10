package com.mucsc2450.cassie.week11;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class Employee {

  public String firstName, lastName;

  public static ArrayList<com.mucsc2450.cassie.week11.Employee> getEmployeesFromFile(String filename, Context context){
    final ArrayList<com.mucsc2450.cassie.week11.Employee> employeeList = new ArrayList<>();

    try {
      String jsonString = loadJsonFromAsset("employees.json", context);
      JSONObject json = new JSONObject(jsonString);
      JSONArray employees = json.getJSONArray("employees");


      for(int i = 0; i < employees.length(); i++){
        com.mucsc2450.cassie.week11.Employee employee = new com.mucsc2450.cassie.week11.Employee();

        employee.firstName = employees.getJSONObject(i).getString("firstName");
        employee.lastName = employees.getJSONObject(i).getString("lastName");

        employeeList.add(employee);
      }
    } catch (JSONException e) {
      e.printStackTrace();
    }

    return employeeList;
  }

  private static String loadJsonFromAsset(String filename, Context context) {
    String json = null;

    try {
      InputStream is = context.getAssets().open(filename);
      int size = is.available();
      byte[] buffer = new byte[size];
      is.read(buffer);
      is.close();
      json = new String(buffer, "UTF-8");
    }
    catch (java.io.IOException ex) {
      ex.printStackTrace();
      return null;
    }

    return json;
  }

}
