// Q.) Bonus on Salary for service above 5 years.
import java.util.Scanner;
class Q3 {
  public static void main(String args[]){
      Scanner Sc = new Scanner(System.in);

      System.out.println("Enter the salary");
      int Salary=Sc.nextInt();

      System.out.println("Enter the year of services to this company");
      int years =Sc.nextInt();

     if(years>5){
         float Bonus=(float)(Salary*0.05);
         float total=(Bonus+Salary);

         System.out.println(" The salary is="+ (total));
       }
       else{
            System.out.println("The Salary is ="+Salary);
        }
    }
}