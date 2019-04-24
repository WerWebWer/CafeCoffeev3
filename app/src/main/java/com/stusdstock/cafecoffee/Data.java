package com.stusdstock.cafecoffee;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class Data extends Application {
    String pho = "https://turboportal.ru/uploads/posts/2014-05/thumbs/1399971466__.jpg";
    //ArrayList<ArrayList<ArrayList<String>>> data = new ArrayList<ArrayList<ArrayList<String>>>();
    public static ArrayList<Comida> Menu;


    public static ArrayList<Comida> shop_list = new ArrayList<Comida>();
    public static  ArrayList<ArrayList<Comida>> history = new ArrayList();

    public void deleteItem(){

    }

    public void Crutch (Context context, List<Comida> comidas){
        ShopListAdapter a = new ShopListAdapter(context,comidas);
    }



}
