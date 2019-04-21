package com.stusdstock.cafecoffee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by pedroneto on 01/10/16.
 */
public class GalleryFragment extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";

    public GalleryFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static GalleryFragment newInstance(int sectionNumber) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_gallery_screen, container, false);
        GridView gridView = (GridView) rootView.findViewById(R.id.galeriaGrid);
        ImageAdapter imageAdapter = new ImageAdapter(getContext());
        imageAdapter.sortByCategory();
        gridView.setAdapter(imageAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), FullImage.class);
                intent.putExtra("pos", i);
                startActivity(intent);
            }
        });
        return rootView;
    }


}
