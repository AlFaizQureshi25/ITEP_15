import java.util.Scanner;
class Area{
    public static void main(String args[]){
       
        int h1, h2, diagonal, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height 1: ");
        h1 = sc.nextInt();
        System.out.print("Enter height 2: ");
        h2 = sc.nextInt();
        System.out.print("Enter diagonal: ");
        diagonal = sc.nextInt();
        area = (int)((diagonal*(h1+h2))/2);
        System.out.println("Area  = "+area);
    }
}