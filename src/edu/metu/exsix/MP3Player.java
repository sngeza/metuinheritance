package edu.metu.exsix;

/**
 * Created by sngeza on 2018. 01. 05..
 */
public class MP3Player extends Electronics {
    private String color;

    public MP3Player(double regularPrice, String manufacturer, String color) {
        super(regularPrice, manufacturer);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double computeSalePrice() {
        return getRegularPrice() - 3;
    }

    @Override
    public String toString() {
        return "MP3: " + super.toString() + " color:" + color;
    }
}
