package ro.siit;
import java.util.*;

public class Book {
    private String name;
    private int numberOfPages;

    public Book(String name, int numberOfPages){
        this.name=name;
        this.numberOfPages=numberOfPages;
    }

    public String getName(){
        return name;
    }

    /**
     * This is the method where I will add books in the list
     * @param book is the book I will add
     */
    public void add(List<Book> books,Book book){
        books.add(book);
    }

    /**
     * This is the method where I will remove books in the list
     * @param book is the book I will remove
     */
    public void delete(List<Book> books,Book book){
        books.remove(book);
    }


    @Override
    public String toString() {
            return "Name of the book: " + name + ", number of pages: " + numberOfPages;
    }
}
