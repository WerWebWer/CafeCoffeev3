package com.stusdstock.cafecoffee;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DebugUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private Context mContext;
    private Context mContext1;
    private List<Comida> listaComidas;
    private BtnClickListener mClickListener = null;
    public interface BtnClickListener {
        public abstract void onBtnClick(int position);
    }

    public RecyclerAdapter (Context context, List<Comida> comidas){
        mContext = context;
        LayoutInflater mLayoutInflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listaComidas = comidas;
    }

    public RecyclerAdapter (Context context, List<Comida> comidas,BtnClickListener listener){
        mContext = context;
        LayoutInflater mLayoutInflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mClickListener = listener;
        listaComidas = comidas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(
                parent.getContext()).inflate(
                R.layout.elemento_lista_comida,
                parent,false);
        return new ViewHolder (itemView);


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final int pos = position;
        Comida item = listaComidas.get(position);
        holder.textNome.setText(item.getname());
        holder.textDescricao.setText(item.getDescricao());
        holder.but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(mContext, Integer.toString(pos), Toast.LENGTH_LONG).show();
            }
        });
//        Glide.with(mContext)
//                .load(item.getPic())
//                .fitCenter()
//                .placeholder(R.drawable.loading)
//                .crossFade()
//                .into(holder.imageComida);

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
            textDescricao= (TextView) itemView.findViewById(R.id.descricaoComida);
            textNome = (TextView) itemView.findViewById(R.id.nomeComida);
            imageComida = (ImageView) itemView.findViewById(R.id.fotoComida);
            but = (Button) itemView.findViewById(R.id.delete);


       }
    }
}
