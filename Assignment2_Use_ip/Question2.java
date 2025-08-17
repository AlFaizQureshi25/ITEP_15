import java.util.Scanner;
class Q2{
    public static void main(String args[]){
System.out.println("Enter the number :");
Scanner sc  = new Scanner(System.in);
float br = sc.nextInt();
float area = sc.nextInt();
float len = area/br;
float para=(len+br)*2;
System.out.println("lenght="+len);
System.out.println("parameter"+para);
    }
}