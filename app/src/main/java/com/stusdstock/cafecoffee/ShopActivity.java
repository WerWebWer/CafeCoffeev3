package com.stusdstock.cafecoffee;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ShopActivity extends AppCompatActivity {

    private ShopFragment fragShop;
    private FragmentTransaction fTrans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_activity);


        fragShop = new ShopFragment();

        fTrans = getFragmentManager().beginTransaction();
        fTrans.add(R.id.frgmShop, fragShop);
        fTrans.commit();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void onStop() {
        super.onStop();
    }

}
