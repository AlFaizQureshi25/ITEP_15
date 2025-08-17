import java.util.Scanner;
  class Square{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term till you want to print the square : ");
         int n=sc.nextInt();
          int i=1,square;

     while(i<=n){
            square=i*i;
            System.out.println("The Square of  "+i+" is : "+square);
            i++;

        }  
    }
}