import java.util.Scanner;
 class Term{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the term till you want to print");
    int n=sc.nextInt();      int i=0,term;
    int sum=0;
   System.out.println("The series is :" );
    while(i<n){
      if(i%2==0){
     term=(i+1);
     System.out.print("+" + term);
     sum=term+sum;
      }else{
        term=(i+1)*(-1);
        System.out.print(term+" ");
        sum=term+sum;
      }
     i++;
    }    
    System.out.println("\n\nthe sum of series is : '"+sum+"'");
  }

}