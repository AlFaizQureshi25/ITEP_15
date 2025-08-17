// Q.) The shape is Rectangle or Square
import java.util.Scanner;
class Q1{
public static void main(String args[]){
    System.out.println("Enter the length and breadth");
Scanner sc=new Scanner (System.in);
float len=sc.nextFloat();
float br=sc.nextFloat();
if (len==br){
    System.out.println("this is a squre");
}else{
    System.out.println("This is a rectangle");
}


}
}