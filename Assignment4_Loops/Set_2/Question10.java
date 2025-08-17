import java.util.Scanner;
class EvenN{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your number ");
     int n=sc.nextInt();
     int i=1,v=0;
     System.out.println("The even number till "+n+" is ");
     if(n>0){
         while(i <= n){
               if(i % 2 == 0) System.out.println(i);
               i++;
            }
        }
    }
}