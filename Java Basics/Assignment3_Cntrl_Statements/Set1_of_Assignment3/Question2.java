// Q.) Discount of 10% for price above 1000
import java.util.Scanner;
class Q2 {
public static void main(String args[]){
System.out.println("Enter the quantity of Purchased Products");
Scanner Sc = new Scanner(System.in);
int Quantity=Sc.nextInt();
float total,dis;
int price=Quantity*100;
 if(price>1000){
     dis=(price*0.10f);
     total=price-dis;
    System.out.println("the amout payable is : "+total);
 }else{
    System.out.println("then amount payable is : "+price);
 }

 }
}