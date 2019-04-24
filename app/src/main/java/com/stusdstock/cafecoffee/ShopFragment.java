package com.stusdstock.cafecoffee;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ShopFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    private Button pay;


    String pho = "https://turboportal.ru/uploads/posts/2014-05/thumbs/1399971466__.jpg";

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
        View rootView = inflater.inflate(R.layout.fragment_shop, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.listaDeComidasView) ;
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);
        ShopListAdapter adapterComida = new ShopListAdapter(getContext(), Data.shop_list);
        rv.setAdapter(adapterComida);
        final RecyclerView rv_1 = rv;

        pay = rootView.findViewById(R.id.button_pay);
        pay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Data.history.add(Data.shop_list);
                Data.shop_list.clear();

                ShopListAdapter adapterComida = new ShopListAdapter(getContext(), Data.shop_list);
                rv_1.setAdapter(adapterComida);
            }
        });
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}
