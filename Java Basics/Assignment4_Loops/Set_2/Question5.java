import java.util.Scanner;
  class Factorial{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
         System.out.print("Enter the number you want to find the  factorial of : ");
           int n =sc.nextInt();
           int i=1,fact=1;
           System.out.println("The factorial of "+n+" is");
     while(i<=n){
            fact=i*fact;
            i++;
        }
      System.out.println(fact);
    }
}