import java.util.Scanner;

class Detect{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        String inputStr = sc.next();
        char ch = inputStr.charAt(0);
        System.out.println(ch);
        if((ch >= 65 && ch <=90) || (ch >= 97 && ch <= 122)){
            System.out.println("Entered character is an alphabet");
        } else {
            System.out.println("Entered character is not an alphabet.");
        }
    }
}