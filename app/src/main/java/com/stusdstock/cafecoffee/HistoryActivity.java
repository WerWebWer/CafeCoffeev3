package com.stusdstock.cafecoffee;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HistoryActivity extends AppCompatActivity {

    private HistoryFragment fragHis;
    private FragmentTransaction fTrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        fragHis = new HistoryFragment();

        fTrans = getFragmentManager().beginTransaction();
        fTrans.add(R.id.frgmHis, fragHis);
        fTrans.commit();
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
