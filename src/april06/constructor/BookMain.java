package april06.constructor;

public class BookMain {

    public static void main(String[] args) {
        Book book=new Book("Jim Collins",2023,"Non Fiction","Good to great");
        book.printBookdetails();

        System.out.println();

        Book book1=new Book("Robert Kiyosaki",2014,"Non Fiction");
        book1.printBookdetails();

        System.out.println();

        Book book2=new Book("Dan Brown",2003,"Fiction","Da Vinci Code");
        book2.printBookdetails();


    }

}
