package com.stusdstock.cafecoffee;

import android.app.Application;
import java.util.ArrayList;

public class Data extends Application {
    //ArrayList<ArrayList<ArrayList<String>>> data = new ArrayList<ArrayList<ArrayList<String>>>();
    private ArrayList<ArrayList<String>> Menu;

    private ArrayList shop_list = new ArrayList<>();

    public void addShop(Comida a){
        shop_list.add(a);
    }

    public ArrayList<ArrayList<String>> getData(){
        ArrayList<String> element = new ArrayList<String>();
//        element.add("erfer","erfer","erfer");
//        element.add();
        element.add("erfer");
       // Menu.set(0, ArrayList<String>).set(0)="0";
                Menu.add(element);
        String[] st1 = {"12","2324","3","2123","14535","2323"};
        return Menu;
    }

}
