import java.util.Scanner;
class Arithemetic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Enter operator to use(-,+,*,/,%):");
        String inputStr = sc.next();
        float result;

        switch(inputStr){
            case "+":
                result = num1 + num2;
                System.out.println("Addition of this numbers is  "+ result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Subtraction of this numbers is  "+ result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Multiplication of this numbers is  "+ result);
                break;

            case "/":
                result = num1 / num2;
                System.out.println("Division of this numbers is  "+ result);
                break;

            case "%":
                result = num1 % num2;
                System.out.println("quoteint by division of this numbers is  "+ result);
                break;

            default:
                System.out.println("Invalid selection.");
        }

        
    }
}