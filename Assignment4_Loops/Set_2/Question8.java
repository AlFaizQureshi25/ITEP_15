import java.util.Scanner;
class Fibonacci{
  public static void main(String arga[]){
     Scanner sc=new Scanner(System.in);
     int n= sc.nextInt();
      int i=0,a=0,b=1,c=0;
     while(n>=i){
       System.out.println(a);
         c=a+b;
            a=b;
            b=c;
            i++;
         }
   }
}