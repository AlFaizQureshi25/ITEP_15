import java.util.Scanner;

class Percent{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total marks:");
        float Totalmarks = sc.nextFloat();
        System.out.println("Enter Marks you obtained:");
        float Obtainedmarks = sc.nextFloat();

        float percentage = (Obtainedmarks/Totalmarks)*100.0f;

        System.out.println("The percent obtained by you: "+ percentage);

    }
}