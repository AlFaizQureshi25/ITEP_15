
//Q.) Yougest and Oldest Person.
import java.util.Scanner;
class Q5{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age ");
    System.out.println("1st person age");
    int per1=sc.nextInt();
    System.out.println("2nd person age");
    int per2=sc.nextInt();
    System.out.println("3rd person age ");
    int per3=sc.nextInt();

    if((per1>per2) && (per1>per3)){
              System.out.println("The Person 1 is oldest");
        if (per3>per2){
              System.out.println("The person 2 is youngest");
        }else{
              System.out.println("The person 3 is youngest");
        }
    }else if ((per2>per1)&&(per2>per3)){
             System.out.println("The person 2 is OLdest");
        if (per3>per1){
             System.out.println("The person 1 is youngest");
        }else {
              System.out.println("The person 3 is youngest");
        }
    }else if((per3>per1)&&(per3>per2)){
      System.out.println("The person3 is oldest");
      if(per2>per1){
        System.out.println("The person 1 is youngest");
      }else {
        System.out.println("The Person 2 is youngest");
      }
    }
  }
}