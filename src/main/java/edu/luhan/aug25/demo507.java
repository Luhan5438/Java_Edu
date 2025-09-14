package edu.luhan.aug25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo507 {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Book("hongloumeng","caoxueqing",100.00));
        list.add(new Book("xiyouji","wuchengen",10.00));
        list.add(new Book("sanguoyanyi","shinaian",5.00));


        //遍历
        Iterator i = list.iterator();

        while (i.hasNext()){
            Object o = i.next();
            System.out.println("book list" + o);
        }

        //sort function
        sort(list);

        //新方法遍历
        for (int j = 0; j < list.size(); j++) {
            System.out.println(" sort list is " + list.get(j));
        }





        }


    public static void sort(List list) {

        int list_size=list.size();


        for (int i = 0; i < list_size-1; i++) {
            boolean swap = false;

            for (int j = 0; j < list_size-1-i; j++) {

                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if ( book1.getPrice() > book2.getPrice()){
                    list.set(j+1,book1);
                    list.set(j,book2);
                    swap = true;
                }

            }

            if (swap = false){
                System.out.println("no change");
                break;
            }

        }

    }
}



    class Book {

        private String bookName;
        private String author;
        private double price;


        public Book(String bookName, String author, double price) {
            this.bookName = bookName;
            this.author = author;
            this.price = price;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
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

        @Override
        public String toString() {
            return "Book{" +
                    "bookName='" + bookName + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

