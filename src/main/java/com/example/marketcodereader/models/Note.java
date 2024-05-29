package com.example.marketcodereader.models;

public class Note extends Client{

    public Note(Client client) {
        super(client.getName(), client.getCPF(), client.getCart());
    }
    @Override
    public String toString(){
        String string = "Nome: "+ getName() +"\n" + "CPF/CNPJ: " + getCPF() +"\n" + "Produtos: " + "\n";
        for (Product product : getCart().getProductList()){
            string = string.concat(String.format("%s R$ %.2f\n",product.getName(),product.getPrice()));
        }
        string =string.concat("Volte Sempre!");
        return string;
    }

}
