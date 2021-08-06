package com.swagatsamal.androidrecycerview;

import android.media.Image;

public class recordPOJO {
    int productID;
    String productName;
    double price;
    int productImage;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "productID: " + productID +
                "\n productName: " + productName +
                "\n price: " + price;
    }
}
