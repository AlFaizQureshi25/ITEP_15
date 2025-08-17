import java.util.Scanner;
class Q18{
  public static void main(String arga[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the nth term : ");
     int n= sc.nextInt();
     int i = 1, a=1,c,b=2;
     System.out.println(a);
     System.out.println(b);
      while(n>=i){
        c=a*b;
     System.out.println(c);
        a=b;
        b=c;
        i++;
      }
   }
}