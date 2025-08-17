import java.util.Scanner;
  class GreaterNo{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter the first number");
      int num1= sc.nextInt();
    
      System.out.println("Enter the Second number");
      int num2= sc.nextInt();

      System.out.println("Enter the Third number");
      int num3= sc.nextInt();


       if( (num1>num2)&&(num1>num3) ){
           System.out.println("Number 1 is greater");
         }else if((num2>num1)&&(num2>num3)){
           System.out.println("number 2 is greater");
         }else{
           System.out.println("number 3 is greater");
        } 

      }

    }