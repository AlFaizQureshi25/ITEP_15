// prob
import java.util.Scanner;
 class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int n=sc.nextInt();
         int rev=0;int i;
        for(i){
           int dig =n%10;
           rev=rev*10+dig;
           n=n/10;
        }
        System.out.println("the reverse is "+rev);
    }
}