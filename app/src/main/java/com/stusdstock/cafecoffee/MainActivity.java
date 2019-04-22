package com.stusdstock.cafecoffee;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private IntroFragment frag1;
    private ComidasFragment frag2;
    private ContactsFragment frag3;
    private ShopFragment fragShop;
    private FragmentTransaction fTrans;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = new IntroFragment();
        frag2 = new ComidasFragment();
        frag3 = new ContactsFragment();
        fragShop = new ShopFragment();
        //client = pahoMqttClient.getMqttClient(getApplicationContext(), Constants.MQTT_BROKER_URL, Constants.CLIENT_ID);
        //Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_LONG).show();
//
//        fTrans = getFragmentManager().beginTransaction();
//        fTrans.add(R.id.container, frag1);
//        fTrans.commit();
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//        Intent intent = new Intent(MainActivity.this, MqttMessageService.class);
//        startService(intent);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fTrans = getFragmentManager().beginTransaction();
                    fTrans.replace(R.id.frgmCont, frag1);
                    fTrans.commit();
                    Log.d("Click", "History");
                    return true;
                case R.id.navigation_dashboard:
                    fTrans = getFragmentManager().beginTransaction();
                    fTrans.replace(R.id.frgmCont, frag2);
                    fTrans.commit();
//                    DashboardFragment dashboardFragment = new DashboardFragment();
//                    FragmentManager manager = getSupportFragmentManager();
//                    manager.beginTransaction().replace(R.id.main_container, frag2).commit();
                    Log.d("Click", "Dashboard");
                    return true;
                case R.id.navigation_notifications:
                    fTrans = getFragmentManager().beginTransaction();
                    fTrans.replace(R.id.frgmCont, frag3);
                    fTrans.commit();
                    Log.d("Click", "Settings");
                    return true;
                default:
                    fTrans = getFragmentManager().beginTransaction();
                    fTrans.add(R.id.frgmCont, frag1);
                    fTrans.commit();
                    break;
            }
            return false;
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_shop) {
            Intent i = new Intent(getApplicationContext(), Contacts.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
