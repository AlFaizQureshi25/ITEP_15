import java.util.Scanner;

class Sign{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Positive.");
        } else if(num < 0){
            System.out.println("Negative.");
        }else{
            System.out.println("Neutral.");
        }
    }
}