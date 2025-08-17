import java.util.Scanner;
  class GreaterNo{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter the first number");
      int num1= sc.nextInt();
    
      System.out.println("Enter the Second number");
      int num2= sc.nextInt();

       if(num1>num2){
        System.out.println("Number one is greater");
       }else if(num2>num1){
        System.out.println("Second number is greater");
       } else{
        System.out.println("None is greater");
       }


    }
  }