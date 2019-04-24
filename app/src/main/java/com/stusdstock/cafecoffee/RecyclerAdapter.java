package com.stusdstock.cafecoffee;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.DebugUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private int type;
    private Comida item;
    private Context mContext;
    private List<Comida> listaComidas;


    public RecyclerAdapter (Context context, List<Comida> comidas,int Type){
        mContext = context;
        LayoutInflater mLayoutInflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listaComidas = comidas;
        type=Type;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = null;
//        if (type!=2){
        itemView = LayoutInflater.from(
                parent.getContext()).inflate(
                R.layout.elemento_lista_comida,
                parent,false);
//        } else {
//            itemView = LayoutInflater.from(
//                    parent.getContext()).inflate(
//                    R.layout.elemento_lista_comida_2,
//                    parent,false);
//        }
        return new ViewHolder (itemView);


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final int pos = position;
        item = listaComidas.get(position);
        holder.textNome.setText(item.getname());
        holder.textDescricao.setText(item.getDescricao());
        holder.but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                //Toast.makeText(mContext, Integer.toString(pos), Toast.LENGTH_LONG).show();
                switch (type) {
                    case 1://Menu
                        //Data.addShop(item.getname());
                        Toast.makeText(mContext,"1",Toast.LENGTH_LONG).show();
                        Data.shop_list.add(item);
                        break;
                    case 2://Action
                        //Data.deleteShop(item.getname());
                        Toast.makeText(mContext,"2",Toast.LENGTH_LONG).show();
                        break;
                    case 3://ShopList
                        Toast.makeText(mContext,"3",Toast.LENGTH_LONG).show();
                        Data.shop_list.remove(item);

                        break;
                    default:
                        Toast.makeText(mContext,"4",Toast.LENGTH_LONG).show();
                        break;
                }
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
        ImageButton imageButton;
        Button but;

        public ViewHolder(final View itemView){
            super(itemView);
//            switch (type){
//                default:
                    textDescricao= (TextView) itemView.findViewById(R.id.descricaoComida);
                    textNome = (TextView) itemView.findViewById(R.id.nomeComida);
                    imageComida = (ImageView) itemView.findViewById(R.id.fotoComida);
                    but = (Button) itemView.findViewById(R.id.delete);
//                    break;
//                case 2:
//                    textDescricao= (TextView) itemView.findViewById(R.id.nomeDescryption);
//                    textNome = (TextView) itemView.findViewById(R.id.nameComida);
//                    imageButton = (ImageButton) itemView.findViewById(R.id.imageButton);
//                    //but = (Button) itemView.findViewById(R.id.delete);
//                    break;
//            }

        }
    }
}