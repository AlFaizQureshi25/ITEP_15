import java.util.Scanner;

class Oddeven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = sc.nextInt();
        if (((num / 2)*2) == num) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}