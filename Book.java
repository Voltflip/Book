// CS 272 Intro to Data Structures
// Program Name: Book.java
// Author: Voltflip
// Date: 01/28/2019
// Purpose: The purpose of this program is to create many methods in order to manipulate various instance variables

public class Book {

    // declare variables

    private String title;
    private int numAuthors;
    private String[] authors;
    private String ISBN;

    public Book() {
        title = null;
        ISBN = null;
        numAuthors = 0;
        authors = new String[3];
    } // end Book constructor with no argument

    public Book (String _title) {
        title = _title;
        ISBN = null;
        numAuthors = 0;
        authors = new String[3];
    } // end Book constructor with String argument

    public Book (Object obj) {

    } // end Book method with Object argument

    public String getTitle() {
        return title;
    } // end getTitle method

    public int getAuthorNumber() {
        return numAuthors;
    } // end getAuthorNumber method

    public void setTitle (String _title) {
        title = _title;
    } // end setTitle method

    public void setISBN (String _isbn) {
        ISBN = _isbn;
    } // end setISBN method

    public boolean addAuthor (String _author) {
        for (int i=0; i < authors.length; i++) {
            if (authors[i] == null) {
                authors[i] = _author;
                numAuthors += 1;
                return true;
            } // end if statement
        } // end for loop
        return false;
    } // end addAuthor method

    public boolean equals (Book obj) {
        if (obj.ISBN == ISBN) {
           return true;
        }
        return false;
    } // end equals method
    
    // I'm pretty sure an Object is an instance of a class you create with 
    // a constructor such as Book1 and Book2 that I create below in the main method. Otherwise I'm not sure
    // what to put in for the argument. Not sure how literally I was supposed to take the method listed in the lab instructions for this section.
    // I hope I did it correctly.

    public static String[] getAllAuthors(Book b1, Book b2) {
      String[] allAuthors = new String[6];
      int a = 0;
         for (int i = 0; i < b1.authors.length; i++) {
            if (b1.authors[i] != null) {
               allAuthors[a] = b1.authors[i];
               a += 1;
            } // end if
         } // end for
         for (int j = 0; j < b2.authors.length; j++) {
            if (b2.authors[j] != null) {
               allAuthors[a] = b2.authors[j];
               a += 1;
            } // end if
         }// end for          
      return allAuthors;
    } // end getAllAuthors method

    public String toString() {
        return String.format("%s %s %d %s", title, ISBN, numAuthors, java.util.Arrays.deepToString(authors));
    } // end toString method

    public static void main (String[] args) {
    
        // test above methods
    
        // create a new book class and print it
        Book Book1 = new Book();
        System.out.println(Book1);
        
        // create a 2nd book class using the method that takes a String parameter which gives it a title. Then print it
        Book Book2 = new Book("The Hobbit");
        System.out.println(Book2);
        
        // give Book2 a new title with setTitle method
        Book2.setTitle("Harry Potter");
        
        // print Book2's new title
        System.out.println(Book2.getTitle());
        
        // give Book1 an author
        Book1.addAuthor("JRR Tolkien");
        
        // give Book2 an author
        Book2.addAuthor("JK Rowling");
        
        // print Book2's number of author's using the getAuthorNumber method
        System.out.println(Book2.getAuthorNumber());
        
        // set Book2's ISBN using the setISBN method
        Book2.setISBN("0-7475-3269-9");
        
        // get authors of both books using the getAllAuthors method and print both of them
        System.out.println(getAllAuthors(Book1, Book2));
        
        // print Book2 using toString method
        System.out.println(Book2.toString());
        
        // compare the 2 books' ISBNs using the equals method
        if (Book1.equals(Book2)) {
           System.out.println("The ISBNs are the same");
        }
        else System.out.println("The ISBNs are different.");
        
        
    } // end main method

} // end Book class
