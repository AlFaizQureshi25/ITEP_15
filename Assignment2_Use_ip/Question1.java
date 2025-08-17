import java.util.Scanner;
class Q1{
    public static void main(String args[]){
System.out.println("Enter the number :");
Scanner sc  = new Scanner(System.in);
float par = sc.nextInt();
float len = sc.nextInt();
float br = (par/2)-len;
float area=(len*br);
System.out.println("breadth="+br);
System.out.println("Area="+area);
    }
}