package com.stusdstock.cafecoffee;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by pedroneto on 01/10/16.‹
 */
public class ContactsFragment extends Fragment {

    private HistoryFragment fragHis;
    private FragmentTransaction fTrans;

    Button his;
    TextView rat;
    Button set;
    Button out;
    Button ab;
    Context context;
    String title = "Выбор есть всегда";
    String message = "Выбери пищу";
    String button1String = "Вкусная пища";
    String button2String = "Здоровая пища";
    AlertDialog.Builder ad;

////////////////////////////////////////////////////////////////////////////////////////////////////
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title = "Exit";
        String message = "Are you sure?";
        String button1String = "Exit";
        String button2String = "Cancel";

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title);  // заголовок
        builder.setMessage(message); // сообщение
        builder.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getActivity().getApplicationContext(), "Возможно вы правы",
                        Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getActivity().getApplicationContext(), "Вы сделали правильный выбор", Toast.LENGTH_LONG)
                        .show();
            }
        });
        builder.setCancelable(true);

        return builder.create();
    }

    @NonNull
    public Dialog onCreateDialog_lol(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("About")
                .setMessage("Это beta-версия. Данное приложение разработана тремя разработчиками. И будет в последствии развиваться и расширяться. Следите за обновлениями.")
                .setIcon(R.drawable.ic_launcher)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Закрываем окно
                        dialog.cancel();
                    }
                });
        return builder.create();
    }

    @NonNull
    public Dialog onCreateDialog_rat(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Rating")
                .setMessage("От 50 до 100 ст.\n" +
                        "Новичок(1%)\n" +
                        "⬇\n" +
                        "От 100 до 200\n" +
                        "Бетховен(3%)\n" +
                        "⬇\n" +
                        "От 200 до 300\n" +
                        "Сальвадор Дали(10%)\n" +
                        "⬇\n" +
                        "От 300 до 500\n" +
                        "Вольтер (13%)\n" +
                        "⬇\n" +
                        "От 500 и больше\n" +
                        "Петр 1 (15%)")
                .setIcon(R.drawable.favourites)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Закрываем окно
                        dialog.cancel();
                    }
                });
        return builder.create();
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_contacts, container, false);

        context = this.getActivity().getApplicationContext();

        View.OnClickListener action1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Uri uriIntentMap = Uri.parse("geo:0,0?q=1600" + Uri.encode("R. Sousa Aroso 447, 4450-289, Matosinhos"));
//                Intent i = new Intent(Intent.ACTION_VIEW, uriIntentMap);
//                i.setPackage("com.google.android.apps.maps");
//                if (i.resolveActivity(getActivity().getPackageManager()) != null)
//                    startActivity(i);
//                else {
//                    //mapText.setText(R.string.botaoIndisponivel);
//
//                }
            }
        };
        TextView rating = (TextView) rootView.findViewById(R.id.rating);
        rating.setOnClickListener(action1);

////////////////////////////////////////////////////////////////////////////////////////////////////
//        ad = new AlertDialog.Builder(context);
//        ad.setTitle(title);  // заголовок
//        ad.setMessage(message); // сообщение
//        ad.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int arg1) {
//                Toast.makeText(context, "Вы сделали правильный выбор",
//                        Toast.LENGTH_LONG).show();
//            }
//        });
//        ad.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int arg1) {
//                Toast.makeText(context, "Возможно вы правы", Toast.LENGTH_LONG)
//                        .show();
//            }
//        });
//        ad.setCancelable(true);
//        ad.setOnCancelListener(new DialogInterface.OnCancelListener() {
//            public void onCancel(DialogInterface dialog) {
//                Toast.makeText(context, "Вы ничего не выбрали",
//                        Toast.LENGTH_LONG).show();
//            }
//        });
////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////


        final Bundle savedInstanceState1 = savedInstanceState;

//        set = (Button) rootView.findViewById(R.id.button5);
//        out = (Button) rootView.findViewById(R.id.button6);

        his= (Button) rootView.findViewById(R.id.button3);
        his.setOnClickListener(new View.OnClickListener()        {
            @Override
            public void onClick(View v)            {
                //Toast.makeText(getContext(),"Пашол нахуй",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), HistoryActivity.class);
                startActivity(i);

            }
        });

        set= (Button) rootView.findViewById(R.id.button4);
        set.setOnClickListener(new View.OnClickListener()        {
            @Override
            public void onClick(View v)            {
                Intent i = new Intent(getActivity(), Settings.class);
                startActivity(i);
            }
        });
        ab = (Button) rootView.findViewById(R.id.button5);
        ab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //ad.show();
                onCreateDialog_lol(savedInstanceState1).show();
            }
        });
        out = (Button) rootView.findViewById(R.id.button6);
        out.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //ad.show();
                onCreateDialog(savedInstanceState1).show();
            }
        });
        rat = (TextView) rootView.findViewById(R.id.rating);
        rat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCreateDialog_rat(savedInstanceState1).show();
            }
        });
        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}


