import java.util.Scanner;
 class Term{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the term till you want to println");
      int n=sc.nextInt();
      int i=0,term;
      int sum=0;
      System.out.println("here is the series");
    while(i<n){
        term=(i+1);
        sum=term+sum;
        i++;
     System.out.println(term);
    }    
      System.out.println("the sum of term is : "+sum);
   }

 }