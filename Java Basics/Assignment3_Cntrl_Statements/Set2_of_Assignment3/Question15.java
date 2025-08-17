import java.util.Scanner;
//correction
class Leapyear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

          if (year%4==0 ){
             if ((year%400==0)&&(year%100==0)&&(year%4==0)){
                System.out.println("this is a leap year and a leap century");
             }else{
                System.out.println("this is a leap year but not leap century");
            }
          }else{
            System.out.println("this is not a leap year");
          }
    }
}