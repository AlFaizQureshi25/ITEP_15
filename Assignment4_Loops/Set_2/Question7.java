import java.util.Scanner;
 class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number");
          int n=sc.nextInt();
          int i =2;
          boolean a =true;
          while(i<=n/2){
            if(n%i==0){
             a=false;
             break;
            } i++;
        }
          if(a){
            System.out.println("This is prime number");
         }else{
            System.out.println(" not a prime number");
        }
    }
}