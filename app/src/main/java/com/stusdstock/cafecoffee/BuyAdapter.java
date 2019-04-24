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

public class BuyAdapter extends RecyclerView.Adapter<BuyAdapter.ViewHolder>{
    String te;
    private Comida item;
    private Context mContext;
    private List<Comida> listaComidas;


    public BuyAdapter(Context context, List<Comida> comidas){
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
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        item = listaComidas.get(position);

        holder.textNome.setText(item.getname());
        holder.textDescricao.setText(item.getDescricao());
        holder.but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(mContext,holder.textNome.getText(), Toast.LENGTH_LONG).show();
                Data.shop_list.add(Data.Menu.get(position));

            }
        });
        switch (Data.Menu.get(position).Id){
            case 0:holder.imageComida.setBackgroundResource(R.drawable.fon0);
            case 1:holder.imageComida.setBackgroundResource(R.drawable.fon1);
            case 2:holder.imageComida.setBackgroundResource(R.drawable.fon2);
            case 3:holder.imageComida.setBackgroundResource(R.drawable.fon3);
            case 4:holder.imageComida.setBackgroundResource(R.drawable.fon4);
            case 5:holder.imageComida.setBackgroundResource(R.drawable.fon5);
            case 6:holder.imageComida.setBackgroundResource(R.drawable.fon6);
            case 7:holder.imageComida.setBackgroundResource(R.drawable.fon7);
        }
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
            textDescricao= (TextView) itemView.findViewById(R.id.descricaoComida);
            textNome = (TextView) itemView.findViewById(R.id.nomeComida);
            imageComida = (ImageView) itemView.findViewById(R.id.fotoComida);
            but = (Button) itemView.findViewById(R.id.delete);
            but.setText("Pay");

        }
    }
}