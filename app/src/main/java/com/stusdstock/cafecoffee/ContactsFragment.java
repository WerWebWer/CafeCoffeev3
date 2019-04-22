package com.stusdstock.cafecoffee;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by pedroneto on 01/10/16.‹
 */
public class ContactsFragment extends Fragment {

    Button set;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_contacts, container, false);

        set = (Button) rootView.findViewById(R.id.button6);
        set.setOnClickListener(new View.OnClickListener()        {
            @Override
            public void onClick(View v)            {
                Intent i = new Intent(getActivity(), Settings.class);
                startActivity(i);
            }
        });

        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}


