import java.util.Scanner;
  class NaturalNo{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      
     System.out.println("enter the nth term till you want to print natural no : ");
      int n= sc.nextInt();
      int i=1;
     system.out.println("The Natural number no in reverse order :  ");
        if(n>0){
         while(n>0){
         System.out.println(n);
         n--;
           }
        }
    }
  }