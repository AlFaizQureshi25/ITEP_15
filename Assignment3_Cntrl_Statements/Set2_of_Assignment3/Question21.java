import java.util.Scanner;

class Triangle{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  angles of Triangle: ");
         
        System.out.println("Angle 1 ");
        int angle1 = sc.nextInt();

        System.out.println("Angle 2 ");
        int angle2 = sc.nextInt();

        System.out.println("Angle 3 ");
        int angle3 = sc.nextInt();

        int sum = angle1 + angle2 + angle3;
        if(sum == 180){
            System.out.println("Its a  traingle.");
        } else {
            System.out.println("IT is not  a triangle.");
        }

    }
}