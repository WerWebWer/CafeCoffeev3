package com.stusdstock.cafecoffee;

import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ComidasFragment extends Fragment {


    private int i=0;
    private static final String ARG_SECTION_NUMBER = "section_number";
    ArrayList<Comida> listaComidas;
//    public ComidasFragment() {
//    }
    String pho = "https://turboportal.ru/uploads/posts/2014-05/thumbs/1399971466__.jpg";
//
//    /**
//     * Returns a new instance of this fragment for the given section
//     * number.
//     */
    public static ComidasFragment newInstance(int sectionNumber) {
        ComidasFragment fragment = new ComidasFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.lista_comidas_view, container, false);
//        RecyclerView rv = (RecyclerView)  rootView.findViewById(R.id.listaDeComidasView) ;
//        rv.setHasFixedSize(true);
//        LinearLayoutManager llm = new LinearLayoutManager(getContext());
//        rv.setLayoutManager(llm);
//
//        listaComidas = new ArrayList<>();
//        adicionarComida(new Comida(pho,"Francesinha", "Blah Blah","1,50"));
//        adicionarComida(new Comida(pho, "Lombo Assado", "Blah Blah","-0.50"));
//
//        BuyAdapter adapterComida = new BuyAdapter(getContext(), listaComidas);
//        rv.setAdapter(adapterComida);
//        return rootView;
//    }
//
    public void adicionarComida(Comida comida){
        if (!listaComidas.contains(comida)) listaComidas.add(comida);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
         Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lista_comidas_view, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.listaDeComidasView) ;
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);

        listaComidas = new ArrayList<>();
        adicionarComida(new Comida(pho,"Эспрессо ", "Espresso / Крепкий, яркий, насыщенный, основа всех кофейных напитков","Buy 60р/30мл"));
        adicionarComida(new Comida(pho, "Латте ", "Latte / Эспрессо, молоко, взбитое на пару и немного молочной пены","Buy 130р/300мл"));
        adicionarComida(new Comida(pho, "Капуччино  ", "Cappuccino / Эспрессо, молоко, взбитое на пару и плотная молочная пена","Buy 110р/200мл"));
        adicionarComida(new Comida(pho, "Флэт Уайт ", "Приготовлен на основе двойного ристретто и молока, подогретого на пару, с небольшим количеством пены, молоко очень жидкое. ","Buy 150р/220"));
        adicionarComida(new Comida(pho, "Латте карамель  ", "Эспрессо п/ф, молоко, карамельный соус п/ф (сахар, молоко, растительные сливки, ванилин)","Buy 180р/250мл"));
        adicionarComida(new Comida(pho, "Латте сингапур  ", "Новый авторский латте с добавлением фирменного карамельно-лимонного топпинга","Buy 180р/250мл"));
        adicionarComida(new Comida(pho, "Американо  ", "Americano / Двойная порция классического эспрессо, смягченная добавлением горячей воды","Buy 110р/250мл"));
        adicionarComida(new Comida(pho, "Горячий шоколад  ", "Горячий шоколад ","Buy 130р/300мл"));
        BuyAdapter adapterComida = new BuyAdapter(getContext(), listaComidas);
        rv.setAdapter(adapterComida);
        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
