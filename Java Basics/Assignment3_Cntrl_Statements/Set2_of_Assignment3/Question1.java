import java.util.Scanner;
class Circle{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the radious : ");
        int radious = sc.nextInt();

        float circleArea = (3.14f)*radious*radious;
        System.out.println("Area of circle is = "+circleArea);
  }
}