package com.stusdstock.cafecoffee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by pedroneto on 10/10/16.
 */
public class IntroFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

//    public IntroFragment() {
//////    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
//    public static IntroFragment newInstance(int sectionNumber) {
////        IntroFragment fragment = new IntroFragment();
////        Bundle args = new Bundle();
////        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
////        fragment.setArguments(args);
////        return fragment;
////    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.intro_fragment, null);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout);
//
//        FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////Create your Controls(UI widget, Button,TextView) and add into layout
//
//                Button btn = new Button(getActivity());
//                btn.setText("LOL");
//                btn.setBackgroundResource(R.drawable.stytle_button);
//                btn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//                linearLayout.addView(btn);
//            }
//        });


    }
}




