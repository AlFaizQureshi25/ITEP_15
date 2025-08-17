import java.util.Scanner;
  class Table{
    public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
          System.out.println("Enter the number you want to print table :  ");
          int n =sc.nextInt();
          int i=1,table;
          System.out.println("the table of "+n+" is : ");
        if(n>0){
            while(i<=10){
              table=n*i;
               System.out.println(table);
               i++;
            }
        }else {
            System.out.println("choose valid number");
        }
    }
  }