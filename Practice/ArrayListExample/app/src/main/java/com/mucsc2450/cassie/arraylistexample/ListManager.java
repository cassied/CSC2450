package com.mucsc2450.cassie.arraylistexample;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
    public ArrayList<ListManager> list;

    public String firstName, lastName;

    public ListManager() {
        list = new ArrayList<ListManager>();
    }

    public static ArrayList<ListManager> getList(){

        return ListManager.getInstance().list;
    }

    public static void addListItems(String first, String last){

        ListManager listObj = new ListManager();

        listObj.firstName = first;
        listObj.lastName = last;

        ListManager.getInstance().list.add(listObj);
    }

    private static ListManager instance;

    public static ListManager getInstance() {
        if (instance == null) instance = new ListManager();
        return instance;
    }
}
