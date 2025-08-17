 //uppeer case and loweer caswe
import java.util.Scanner;
class Q9{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter an Alphabet");
      char x=sc.next().charAt(0);
      if((65<=x)&&(x<=90)){
        System.out.println("Entered Character is in Upper case");
      }
      else if((97<=x)&&(x<=122)){
        System.out.println("Entered Character is in Lower case");
      }
      else System.out.println("Not a Alphabet");
    }
}