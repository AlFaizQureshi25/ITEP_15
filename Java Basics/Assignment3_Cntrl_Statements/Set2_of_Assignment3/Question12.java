import java.util.Scanner;
class Vowel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Englis letter to check if it is  Vowel:");
        char letter = sc.next().charAt(0);
        float result;

        switch(letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println("Entered letter is a vowel."); break;
            default:
                System.out.println("Entered letter is not a vowel.");
        }

        
    }
}