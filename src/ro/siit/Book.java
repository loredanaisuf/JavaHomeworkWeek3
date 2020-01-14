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


    @Override
    public String toString() {
            return "Name of the book: " + name + ", number of pages: " + numberOfPages;
    }
}
