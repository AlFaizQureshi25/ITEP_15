class Book{
    private String price;
    private String title;
    private String author;

   public void SetPrice(String price){
        this.price = price;
    }

    
   public void SetTitle(String title){
         this.title=title;
    }

   public void SetAuthor(String author){
        this.author=author;
   }

   public void display(){
    System.out.println(title+"\t\t"+author+"\t\t\t "+price);
   }
}

class Testmain{
    public static void main(String args[]){
        System.out.println("Title       \t\t\t Author    \t\t\t Price ");
        Book details=new Book();
        details.SetTitle("The Wings Of Fire ");
        details.SetAuthor("Arun Tiwari");
        details.SetPrice("495 Rs");
         details.display();

        Book details1=new Book();
        details1.SetTitle("Conquest of Mind");
        details1.SetAuthor("Swami Sivananda");
        details1.SetPrice("195 Rs");
        details1.display();
    }
}