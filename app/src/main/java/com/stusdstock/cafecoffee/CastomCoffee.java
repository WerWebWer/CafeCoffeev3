package com.stusdstock.cafecoffee;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CastomCoffee  extends AppCompatActivity {

    Button bt;

    @NonNull
    public Dialog onCreateDialog_C(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplication());
        builder.setTitle("Rating")
                .setMessage("To be continued....")
                .setIcon(R.drawable.favourites)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Закрываем окно
                        dialog.cancel();
                    }
                });
        return builder.create();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_coffee_creator);
        final Bundle savedInstanceState1 = savedInstanceState;

        bt = (Button) findViewById(R.id.buttonC);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //ad.show();
                onCreateDialog_C(savedInstanceState1).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}