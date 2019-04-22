package com.stusdstock.cafecoffee;

import android.app.Application;
import java.util.ArrayList;

public class Data extends Application {
    //ArrayList<ArrayList<ArrayList<String>>> data = new ArrayList<ArrayList<ArrayList<String>>>();
    private ArrayList<ArrayList> Menu;

    public ArrayList<ArrayList> getData(){
        String[] st = {"1","2","13","21","15","223"};
        Menu.get(0).add(st);
        String[] st1 = {"12","2324","3","2123","14535","2323"};
        return Menu;
    }
}
