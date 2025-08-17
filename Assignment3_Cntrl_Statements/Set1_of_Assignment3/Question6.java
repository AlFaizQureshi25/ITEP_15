//Q4.) Absolute value of a number. 
import java.util.Scanner;
 class AbsValue{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         
                   System.out.println("enter the number");
                   int num=sc.nextInt();
         if (num<0){
                   num=(num*(-1));
                   System.out.println("your absolute value of this number  is : "+num);
                }else{
                   System.out.println("your absolute value of this numberis : "+num);
            } 
        }    
    }