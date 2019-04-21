package com.stusdstock.cafecoffee;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

class ImageAdapter extends BaseAdapter{
    private Context mContext;
    public ImageAdapter(Context c){
        mContext = c;
    }
    String pho = "";

    private ImagemGaleria[] imagens = {
            new ImagemGaleria(pho,ImagemGaleria.Categoria.COMIDA),
            new ImagemGaleria(pho, ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria(pho,ImagemGaleria.Categoria.COMIDA),
            new ImagemGaleria(pho, ImagemGaleria.Categoria.SALGADOS),
            new ImagemGaleria(pho, ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria(pho, ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria(pho, ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria(pho, ImagemGaleria.Categoria.DOCES)
    } ;

    public void sortByCategory(){

        boolean ordenado;
        do {
            ordenado = true;
            for (int i = 0; i< imagens.length -1; i++){
                if(imagens[i].getCategoria() == ImagemGaleria.Categoria.DOCES){
                    if(imagens[i+1].getCategoria()!= ImagemGaleria.Categoria.DOCES){
                        switchImagens(i,i+1);
                        ordenado = false;
                    }
                }
                else if (imagens[i].getCategoria() == ImagemGaleria.Categoria.SALGADOS) {
                    if(imagens[i+1].getCategoria()== ImagemGaleria.Categoria.COMIDA){
                        switchImagens(i,i+1);
                        ordenado = false;
                    }
                }
            }

        }while (!ordenado);
    }

    private void switchImagens(int i , int j) {
        ImagemGaleria aux = null;
        aux =imagens[i];
        imagens[i] = imagens[j];
        imagens[j] = aux;
    }

    @Override
    public int getCount() {
        return  imagens.length;
    }

    @Override
    public Object getItem(int i) {
        return imagens[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if(view == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(225,200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);

        }
        else{
            imageView = (ImageView) view ;
        }
        //Picasso.with(mContext).load("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13064619_653321451472593_1603234613346657467_o.jpg").fit().into(imageView);
        //imageView.setImageResource(imagens[i]);
        //String url = myUrls.get(position);

//        Glide.with(mContext)
//                .load(imagens[i].getUrl())
//                .fitCenter()
//                .placeholder(R.drawable.loading)
//                .crossFade()
//                .into(imageView);

        return imageView;

    }
}

