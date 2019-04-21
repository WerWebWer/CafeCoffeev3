package com.stusdstock.cafecoffee;

class Comida {

    private String name;
    private String descricao;
    private String pic;
    private String price;


    public Comida(String pic, String name, String descricao, String price){
        setPic(pic);
        setDescricao(descricao);
        setname(name);
        setPrice(price);
    }

    private void setPrice(String price) {
        this.price = price;
    }

    private String getPrice() {
        return price;
    }


    public void setPic(String pic){
        this.pic = pic;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPic() {
        return pic;
    }
}
