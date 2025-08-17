import java.util.Scanner;
class Swap{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the first number : ");
        int a= sc.nextInt();
        System.out.println("Enter the Second number : ");
        int b= sc.nextInt();

        System.out.println("Before swap number 1 : "+a+"\nnumber 2 : "+b);

        a=a^b;
        b=a^b;
        a=a^b;

     System.out.println("After swap number 1 : "+a+"\nnumber 2 : "+b);
    }
}