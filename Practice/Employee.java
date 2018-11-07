package com.mucsc2450.cassie.newweek11;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Employee {

  public String firstName, lastName;
  public static String jsonString;
  public static Boolean loaded = false;
  public static JSONObject json;
  public static JSONArray employees;

  public static ArrayList<Employee> getEmployeesFromFile(String filename, Context context){
    ArrayList<Employee> employeeList = new ArrayList<>();

    if (!loaded) {
        saveJsonToFile(loadJsonFromAsset("employees.json", context), context);
        loaded = true;
    }

    try {
      setJsonParent(filename, context);

      for(int i = 0; i < employees.length(); i++){
        Employee employee = new Employee();

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

    public static void saveJsonToFile(String fileContents, Context context) {
        try {
            FileOutputStream outputStream = context.openFileOutput("employeeslocal.json", context.MODE_PRIVATE);

            outputStream.write(fileContents.getBytes());
            outputStream.close();

            loaded = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String readFromFile(String filename, Context context) {
        String json = null;

        try {
            InputStream is = context.openFileInput(filename);
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

    private static void setJsonParent(String filename, Context context) {
        try {
            jsonString = readFromFile(filename, context);
            json = new JSONObject(jsonString);
            employees = json.getJSONArray("employees");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void updateJSONFile(Context context, ArrayList<Employee> empList) {
        JSONObject mainJSON = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        try {
            for (int i=0; i < empList.size(); i++) {
                JSONObject newItem = new JSONObject();
                newItem.put("firstName", empList.get(i).firstName);
                newItem.put("lastName", empList.get(i).lastName);

                jsonArray.put(newItem);
            }

            mainJSON.put("employees", jsonArray);
            Employee.saveJsonToFile(mainJSON.toString(), context);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
  
  
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
