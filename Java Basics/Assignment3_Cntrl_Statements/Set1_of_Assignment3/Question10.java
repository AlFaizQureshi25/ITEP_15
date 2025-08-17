// Q.) IT is a leap year or not.
import java.util.Scanner;
 class Leapyear{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
     
    System.out.println("enter the year");
       int year=sc.nextInt();
     
    if (year%100==0){
          if(year%400==0){
       System.out.println("This is A leap century");
           }else{
               System.out.println("not a leap year ");
    }}  else if (year%4==0){
       System.out.println("This is leap year");
    }else {
       System.out.println("this is not  a leap year");
    }

      
    }
}