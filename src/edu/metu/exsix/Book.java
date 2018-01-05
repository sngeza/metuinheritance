package edu.metu.exsix;

/**
 * Created by sngeza on 2018. 01. 05..
 */
public class Book extends Product {
    private String publisher;
    private int yearPublished;

    public Book(double regularPrice, String publisher, int yearPublished) {
        super(regularPrice);
        this.setPublisher(publisher);
        this.setYearPublished(yearPublished);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public double computeSalePrice() {
        return 0.95 * getRegularPrice();
    }

    @Override
    public String toString() {
        return "Book: " + super.toString() + " publisher: " + publisher + " year: " + yearPublished;
    }
}
