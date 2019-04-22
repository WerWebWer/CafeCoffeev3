package com.stusdstock.cafecoffee;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ShopActivity extends AppCompatActivity {
    Data appData = ((Data)getApplicationContext());
    ArrayList<ArrayList> data = appData.getData();

    private static final String ARG_SECTION_NUMBER = "section_number";
    ArrayList<Comida> listaComidas;
    String pho = "https://turboportal.ru/uploads/posts/2014-05/thumbs/1399971466__.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_activity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView rv = (RecyclerView)  findViewById(R.id.listaDeComidasView) ;
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        listaComidas = new ArrayList<>();
        adicionarComida(new Comida(pho,"Francesinha", "Blah Blah","1,50"));
        adicionarComida(new Comida(pho, "Lombo Assado", "Blah Blah","-0.50"));

        RecyclerAdapter adapterComida = new RecyclerAdapter(this, listaComidas);
        rv.setAdapter(adapterComida);
    }
    public void adicionarComida(Comida comida){
        if (!listaComidas.contains(comida)) listaComidas.add(comida);
    }


}
