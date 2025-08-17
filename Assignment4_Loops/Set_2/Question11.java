// print N even NUmbers.
import java.util.Scanner;
class OddNo{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your number ");
     int n=sc.nextInt();
     int i=1;int a=1;
     System.out.println("The "+n+" Odd number are ");
     if(n>0){  
         while(i<=n){
               System.out.println(a);
                a=a+2;
                i++;
            }
        }
    }
}