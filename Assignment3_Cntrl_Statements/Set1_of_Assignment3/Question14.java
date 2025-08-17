
import java.util.Scanner;
 class Grades{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
 
      System.out.println("Enter you perccentaage :");
      float percentage=sc.nextFloat();

      if(90<percentage){
           System.out.println("A grade");
     }else{
          if((90>percentage)&& (80<percentage)){
               System.out.println("B grade");
           }else if((80>percentage)&&(60<percentage)){
               System.out.println("C garde");
            }else {
                System.out.println("D grade");
            }
 
        }


    }

 }