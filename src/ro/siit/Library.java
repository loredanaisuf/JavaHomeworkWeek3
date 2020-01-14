package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<Book>();

    /**
     * This is the method where I will add books in the list
     * @param book is the book I will add
     */
    public void add(Book book){
        books.add(book);
    }

    /**
     * This is the method where I will remove books in the list
     * @param book is the book I will remove
     */
    public void delete(Book book){
        books.remove(book);
    }

    public List<Book> getListOfBooks(){
        List<Book> auxBooks=new ArrayList<>();
        for(Book b:books)
            auxBooks.add(b);
        return auxBooks;
    }
}
