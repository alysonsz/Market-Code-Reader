package com.example.marketcodereader.models;

public class Client {
    private final String name;
    private final String CPF;

    private final Cart cart;

    public Client(String name, String CPF, Cart cart) {
        this.name = name;
        this.CPF = CPF;
        this.cart = cart;
    }

    public Cart getCart(){
        return cart;
    }

    public String getName() {
        return name;
    }


    public String getCPF() {
        return CPF;
    }

}
