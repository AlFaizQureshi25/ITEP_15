import java.util.Scanner;

class Triangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides :");

        System.out.println(" side 1 :");
        int side1 = sc.nextInt();
        System.out.println(" sides 2 :");
        int side2 = sc.nextInt();

        System.out.println(" sides 3 :");
        int side3 = sc.nextInt();

        if((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("it  is  an equilateral triangle.");
        }
        else if((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("It is  an isosceles Triangle.");
        } else 
            System.out.println("This  is a scalen triangle.");

    }
}