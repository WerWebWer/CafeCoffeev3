package com.stusdstock.cafecoffee;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ComidasFragment extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";
    ArrayList<Comida> listaComidas;
    public ComidasFragment() {
    }
    String pho = "https://turboportal.ru/uploads/posts/2014-05/thumbs/1399971466__.jpg";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ComidasFragment newInstance(int sectionNumber) {
        ComidasFragment fragment = new ComidasFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lista_comidas_view, container, false);
        RecyclerView rv = (RecyclerView)  rootView.findViewById(R.id.listaDeComidasView) ;
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);

        listaComidas = new ArrayList<>();
        adicionarComida(new Comida(pho,"Francesinha", "Blah Blah","1,50"));
        adicionarComida(new Comida(pho, "Lombo Assado", "Blah Blah","-0.50"));

        RecyclerAdapter adapterComida = new RecyclerAdapter(getContext(), listaComidas);
        rv.setAdapter(adapterComida);
        return rootView;
    }

    public void adicionarComida(Comida comida){
        if (!listaComidas.contains(comida)) listaComidas.add(comida);
    }
}
