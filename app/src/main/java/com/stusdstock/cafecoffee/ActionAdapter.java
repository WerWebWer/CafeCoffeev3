package com.stusdstock.cafecoffee;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ActionAdapter extends RecyclerView.Adapter<ActionAdapter.ViewHolder>{

    private Comida item;
    private Context mContext;
    private List<Comida> listaComidas;


    public ActionAdapter(Context context, List<Comida> comidas){
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
                R.layout.elemento_lista_action,
                parent,false);
        return new ViewHolder (itemView);


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final int pos = position;
        item = listaComidas.get(position);
        holder.textNome.setText(item.getname());
        holder.textDescricao.setText(item.getDescricao());
        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mContext,"Пашол нахуй",Toast.LENGTH_LONG).show();
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
        ImageButton imageButton;
        Button but;

        public ViewHolder(final View itemView){
            super(itemView);
            textDescricao= (TextView) itemView.findViewById(R.id.nomeDescryption);
            textNome = (TextView) itemView.findViewById(R.id.nameComida);
            imageButton = (ImageButton) itemView.findViewById(R.id.imageButton);
        }
    }
}