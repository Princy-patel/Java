package com.company;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBokk(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book +  " has been added" );
    }
    void showAvailablebook(){
        System.out.println("Available book are: ");
        for (String book: this.books) {
            if (book==null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
}
public class library_problem {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBokk("Think and Grow");
        centralLibrary.addBokk("Steve Jobs");
        centralLibrary.addBokk("Android Development");
        centralLibrary.showAvailablebook();
    }
}
