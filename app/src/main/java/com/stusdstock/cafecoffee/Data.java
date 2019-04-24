package com.stusdstock.cafecoffee;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class Data extends Application {
    //ArrayList<ArrayList<ArrayList<String>>> data = new ArrayList<ArrayList<ArrayList<String>>>();
    private ArrayList<ArrayList<String>> Menu;

    public static ArrayList<Comida> shop_list = new ArrayList<Comida>();
    public static  ArrayList<ArrayList<Comida>> history = new ArrayList();

    public void deleteItem(){

    }

    public void Crutch (Context context, List<Comida> comidas){
        ShopListAdapter a = new ShopListAdapter(context,comidas);
    }



}
