package edu.metu.exsix;

public class Main {

    public static void main(String[] args) {
        Product[] pa = new Product[5];

        pa[0] = new TV(1000, "Samsung", 30);
        pa[1] = new TV(2000, "Sony", 89);
        pa[2] = new MP3Player(250, "Apple", "blue");
        pa[3] = new Book(34, "Sun press", 1992);
        pa[4] = new Book(15, "Korea press", 1986);

        for (Product p:pa) {
            System.out.println(p);
        }

    }
}
