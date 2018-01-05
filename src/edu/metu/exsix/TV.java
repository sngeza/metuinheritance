package edu.metu.exsix;

//import edu.metu.exsix.Electronics;
//import edu.metu.exsix.Product;
import edu.metu.exsix.*;
import java.util.ArrayList;
/**
 * Created by sngeza on 2018. 01. 05..
 */
public class TV extends Electronics {
    private int size;

    public TV(double regularPrice, String manufacturer, int size) {
        super(regularPrice, manufacturer);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TV: " + super.toString() + " size:" + size;
    }

    @Override
    public double computeSalePrice() {
        return getRegularPrice();
    }
}
