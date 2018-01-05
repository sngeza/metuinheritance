package edu.metu.exsix;

/**
 * Created by sngeza on 2018. 01. 05..
 */
public class Product {
    private double regularPrice;

    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double computeSalePrice() {
        return 0.9*regularPrice;
    }

    public String toString() {
        return "regular price: " + regularPrice + " sale price: " + computeSalePrice();
    }
}
