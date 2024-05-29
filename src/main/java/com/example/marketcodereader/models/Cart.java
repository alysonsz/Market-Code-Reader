package com.example.marketcodereader.models;

import java.util.ArrayList;

public class Cart {
    private final ArrayList<Product> productList;

    public Cart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public String getTotalItemsValue(){
        double total = 0;
        for (Product product: productList){
            total += product.getPrice();
        }
        return String.format("Total: R$ %.2f", total);
    }

    public void clearCart(){
        productList.clear();
    }
    public ArrayList<Product> getProductList(){
        return productList;
    }


}
