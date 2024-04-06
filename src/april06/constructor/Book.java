package april06.constructor;

public class Book {

    String author;
    int publishYear;
    String genre;
    String bookName;
    double price=50.00;


    Book(){

    }

    Book(String genre){
        this();
        this.genre=genre;
    }

    Book(String author,int publishYear,String genre){
        this(genre);
        this.author=author;
        this.publishYear=publishYear;
        bookName="Rich Dad Poor Dad";
        price=100;

    }

    Book(String author,int publishYear,String genre, String bookName){
        this(genre);
        this.author=author;
        this.publishYear=publishYear;
        this.bookName=bookName;
    }

    public void printBookdetails(){
        System.out.println("author = " + author);
        System.out.println("publishYear = " + publishYear);
        System.out.println("genre = " + genre);
        System.out.println("bookName = " + bookName);
        System.out.println("price = " + price);

    }



}
