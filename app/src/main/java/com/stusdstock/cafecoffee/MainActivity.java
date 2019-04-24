package com.stusdstock.cafecoffee;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
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
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private IntroFragment frag1;
    private ComidasFragment frag2;
    private ContactsFragment frag3;
    private ShopFragment fragShop;
    private FragmentTransaction fTrans;
    private DatabaseReference mFirebaseDatabaseReference;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FirebaseDatabase db = FirebaseDatabase.getInstance();
//        DatabaseReference ref = db.getReference("0"); // Key
//
//        // Attach listener
//        ref.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                Log.d("FireBase", "Cool");
//                // Retrieve latest value
//                String message = dataSnapshot.getValue(String.class);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                Log.d("FireBase", "ERROR");
//            }
//        });

//        mFirebaseAuth = FirebaseAuth.getInstance();
//        mFirebaseUser = mFirebaseAuth.getCurrentUser();
//        if (mFirebaseUser == null) {
//            // Not signed in, launch the Sign In activity
//            startActivity(new Intent(this, SignInActivity.class));
//            finish();
//            return;
//        } else {
//            mUsername = mFirebaseUser.getDisplayName();
//            if (mFirebaseUser.getPhotoUrl() != null) {
//                mPhotoUrl = mFirebaseUser.getPhotoUrl().toString();
//            }
//        }


        frag1 = new IntroFragment();
        frag2 = new ComidasFragment();
        frag3 = new ContactsFragment();


        fragShop = new ShopFragment();
        fTrans = getFragmentManager().beginTransaction();
        fTrans.add(R.id.frgmCont, frag1);
        fTrans.commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

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
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_shop) {
            Intent i = new Intent(getApplicationContext(), ShopActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.activity_open_enter,0);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.activity_close_bottom,0);
    }

}
