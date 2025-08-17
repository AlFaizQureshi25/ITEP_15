import java.util.Scanner;

class Positive{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        
        if(num > 0){
            System.out.println("Entered Number is Positive");
        } else if(num < 0){
            System.out.println("Entered Number is Negative");
        } else {
            System.out.println("Entered Number is Neutral");
        }
    }
}