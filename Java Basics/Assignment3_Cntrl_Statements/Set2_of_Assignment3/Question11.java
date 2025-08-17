import java.util.Scanner;

class Oddeven{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        switch (num % 2) {
            case 0:
                System.out.println(num + " is a Even Number ");
                break;
            default:
                System.out.println(num + " is an Odd Number");
        }
    }
}