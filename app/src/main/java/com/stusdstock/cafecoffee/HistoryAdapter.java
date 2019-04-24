package com.stusdstock.cafecoffee;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder>{

    private Comida item;
    private Context mContext;
    private ArrayList<ArrayList<Comida>> listaComidas;


    public HistoryAdapter(Context context, ArrayList<ArrayList<Comida>> comidas){
        mContext = context;
        LayoutInflater mLayoutInflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listaComidas = comidas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = null;
        itemView = LayoutInflater.from(
                parent.getContext()).inflate(
                R.layout.elemento_lista_comida,
                parent,false);
        return new ViewHolder (itemView);


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final int pos = position;
        //item = listaComidas.get(position);
        holder.textNome.setText("Order #"+position);
        String a = new String();
        for (int i=0;i<Data.history.get(position).size();i++){
            a+=  Data.history.get(position).get(i).getname()+'\n';
        }
        holder.textDescricao.setText(a);
        holder.but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                //Toast.makeText(mContext,"1",Toast.LENGTH_LONG).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return listaComidas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textNome;
        TextView textDescricao;
        ImageView imageComida;
        Button but;


        public ViewHolder(final View itemView){
            super(itemView);
            textDescricao = (TextView) itemView.findViewById(R.id.hisory_item);
            textNome = (TextView) itemView.findViewById(R.id.history_name);
            but = (Button) itemView.findViewById(R.id.history_button);
            //but.setText("Pay");

        }
    }
}