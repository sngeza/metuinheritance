package edu.metu.exsix;

import edu.metu.exsix.Product;

/**
 * Created by sngeza on 2018. 01. 05..
 */
public class Electronics extends Product {
    private String manufacturer;

    public Electronics(double regularPrice, String manufacturer) {
        super(regularPrice);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Electronics: " + super.toString() +
                " manufacturer: " + manufacturer;
    }
}
