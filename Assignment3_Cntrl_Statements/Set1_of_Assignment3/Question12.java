//reverse the string
import java.util.Scanner;
class Q12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
         String x=sc.next();String rev="";
         int len=x.length();
         for(int i=len-1;i>=0;i--){
           rev= rev + x.charAt(i);
        }
        System.out.println(rev);

    }
}