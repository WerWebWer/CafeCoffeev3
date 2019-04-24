package com.stusdstock.cafecoffee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pedroneto on 10/10/16.
 */
public class IntroFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    ArrayList<Comida> listaComidas;
    ArrayList<Comida> listaComidas_1;

    String pho = "https://turboportal.ru/uploads/posts/2014-05/thumbs/1399971466__.jpg";

    public static ComidasFragment newInstance(int sectionNumber) {
        ComidasFragment fragment = new ComidasFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
    public void adicionarComida(Comida comida){
        if (!listaComidas.contains(comida)) listaComidas.add(comida);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.intro_fragment, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.listaDeComidasView_1) ;
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(llm);

        listaComidas = new ArrayList<>();
        adicionarComida(new Comida(pho,"Francesinha", "Blah Blah","1,50"));
        adicionarComida(new Comida(pho, "Lombo Assado", "Blah Blah","-0.50"));
        RecyclerAdapter adapterComida = new RecyclerAdapter(getContext(), listaComidas,2);
        rv.setAdapter(adapterComida);


        RecyclerView rv_1 = (RecyclerView) rootView.findViewById(R.id.listaDeComidasView_2) ;
        rv_1.setHasFixedSize(true);
        LinearLayoutManager llm1 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rv_1.setLayoutManager(llm1);

        listaComidas_1 = new ArrayList<>();
        adicionarComida(new Comida(pho,"Francesinha", "Blah Blah","1,50"));
        adicionarComida(new Comida(pho, "Lombo Assado", "Blah Blah","-0.50"));

        RecyclerAdapter adapterComida_1 = new RecyclerAdapter(getContext(), listaComidas,1);
        rv_1.setAdapter(adapterComida_1);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}