import java.util.Scanner;
  class NaturalNo{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      
      System.out.println("enter the nth term till you want to print natural no : ");
         int n= sc.nextInt();
         int i=1;
         System.out.println("The Natural numbers till are :  "+n);
         if(n>0){
           while(i<=n){
            System.out.println(i);
            i++;
          }
        }

    }
  }