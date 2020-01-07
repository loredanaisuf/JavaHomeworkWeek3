package ro.siit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String readTheTitle() {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the title:");
        String scanName = keyboard.nextLine();
        return scanName;
    }

    public static int readTheNumberOfPages(){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the nr of pages:");
        int scanNumberOfPages = keyboard.nextInt();
        return scanNumberOfPages;
    }

    public static String readTheSpecific(){
        Scanner keyboard = new Scanner(System.in);
        String scanSpecific = keyboard.nextLine();
        return scanSpecific;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        int optiune = 0;
        String scanName;
        int scanNumberOfPages;
        String scanType;
        String scanPaperQuality;
        while (optiune != 6) {
            System.out.println("Choose one of the following options:");
            System.out.println("1.Insert a book");
            System.out.println("2.Insert a novel");
            System.out.println("3.Insert an album");
            System.out.println("4.Delete any book");
            System.out.println("5.Show the list of books");
            System.out.println("6.Exit!");
            Scanner keyboard = new Scanner(System.in);
            optiune = keyboard.nextInt();
            switch (optiune) {
                case (1): {
                    scanName=readTheTitle();
                    scanNumberOfPages=readTheNumberOfPages();
                    Book book = new Book(scanName, scanNumberOfPages);
                    book.add(books, book);
                    break;
                }

                case (2): {
                    scanName=readTheTitle();
                    scanNumberOfPages=readTheNumberOfPages();
                    System.out.println("Enter the type of the novel:");
                    scanType=readTheSpecific();
                    Novel novel=new Novel(scanName,scanNumberOfPages,scanType);
                    novel.add(books,novel);
                    break;
                }

                case (3): {
                    scanName=readTheTitle();
                    scanNumberOfPages=readTheNumberOfPages();
                    System.out.println("Enter the paper quality of the album:");
                    scanPaperQuality=readTheSpecific();
                    Album album=new Album(scanName,scanNumberOfPages,scanPaperQuality);
                    album.add(books, album);
                    break;
                }

                case(4):{
                    scanName=readTheTitle();
                    boolean isInTheList=false;
                    for(Book b:books) {
                        if (b.getName().equals(scanName)) {
                            b.delete(books,b);
                            isInTheList=true;
                            break;
                        }
                    }
                    if(!isInTheList)
                        System.out.println("This name doesn't exist in the list!");
                    break;
                }

                case (5): {
                    if(books.isEmpty())
                        System.out.println("The list is empty!");
                    for (Book b : books)
                        System.out.println(b);
                    break;
                }

                case (6): {
                    break;
                }
            }
        }

    }
}
