package edu.luhan.aug25.demo501;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class collectiondemo {

    public static void main(String[] args) {
        Collection col = new ArrayList<>();

        col.add(new book("harry porter","jk",30.7));
        col.add(new book("snow white","john",8.9));
        Iterator iterator = col.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

        for (Object o : col) {
            System.out.println(o);

        }

    }

    static class book{

        private String book_name;
        private String author;
        private double price;

        public String getBook_name() {
            return book_name;
        }

        public void setBook_name(String book_name) {
            this.book_name = book_name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public book(String book_name, String author, double price) {
            this.book_name = book_name;
            this.author = author;
            this.price = price;
        }

        @Override
        public String toString() {
            return "book"+book_name+author+price;
        }
    }
}
