import java.util.Scanner;

class Divisiblity{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if it is a multiple of 5 and 11 or not:");
        int num = sc.nextInt();
        if((num%5==0)&&(num%11==0))
        {
          System.out.println("Yes it is divisible by 5 and 11");
        }else {
            System.out.println("no it is not divisible by 5 and 11");
        }

    }
}