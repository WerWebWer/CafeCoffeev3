package com.stusdstock.cafecoffee;

import java.util.ArrayList;

public class Data {
    //ArrayList<ArrayList<ArrayList<String>>> data = new ArrayList<ArrayList<ArrayList<String>>>();
    ArrayList<ArrayList> Menu;
    public Data(){
        String[] st = {"1","2","13","21","15","223"};
        Menu.get(0).add(st);
        String[] st1 = {"12","2324","3","2123","14535","2323"};
        Menu.get(1).add(st1);
    }
}
