import java.util.Scanner;
class EvenNo{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your number ");
     int n=sc.nextInt();
     int i=1,v=0;
     System.out.println("The "+n+" numbers are ");
     System.out.println(v);

     if(n>0){
         while(i <= n){
            v = v + 2;
            System.out.println(v);
            i++;
            }
        }
    }
}