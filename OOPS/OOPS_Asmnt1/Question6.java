// Remainiing.

import java.util.Scanner;
import java.util.ArrayList;
class Library{
    ArrayList<Book> Shelf=new ArrayList<Book>();

    public void AddBook(Book b){
        Shelf.add(b);
    }

    public void RemoveBook(Book b){
        Shelf.remove(b);
    }

    public void ShowBookDetails(){
        for(Book bk : Shelf){
          bk.Display();
        }
    }
}

class Book{
   private String title;
   private String author;
   private int isbn;

   public Book(){}

   public Book(String title,String author,int isbn){
      this.title=title;
      this.author=author;
      this.isbn=isbn;
    }

   public void Display(){
       System.out.println("The  book "+title+" has ISBN number "+isbn+" is writen by "+author);
   }
}
class Test{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of books you want to Add : ");
        int n=sc.nextInt();
         sc.nextLine();
        Book Books[]=new Book[n];
        Library lib=new Library();

        int i;
        
        for( i=0;i<n;i++){
            System.out.println("Enter the Book "+(i+1)+" title : ");
            String title=sc.nextLine();
            System.out.println("Enter the Book "+(i+1)+" Author name : ");
            String author=sc.nextLine();
            System.out.println("Enter the ISBN of the Book "+(i+1)+" : ");
            int isbn=sc.nextInt();
            sc.nextLine();
            Books[i]=new Book(title,author,isbn);
            lib.AddBook(Books[i]);
        }
         System.out.println("Here is the Book Details\n------------\n------------");
         lib.ShowBookDetails();
         System.out.println("Do you want to Remove a book IF yes choose Y if not choose N : ");
         char X=sc.next().charAt(0);
         if(X=='Y'|| X=='y'){
            System.out.println("Enter the book no you want to delete : ");
            i=sc.nextInt();
            lib.RemoveBook(Books[i-1]);
        }
         System.out.println("Here is the Book Details\n----------\n------------");
         lib.ShowBookDetails();
    }
}