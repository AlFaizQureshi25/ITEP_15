import java.util.Scanner;
 class SimOfNat{
   public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
     System.out.println("Enter the nth term : ");
        int n=sc.nextInt();
        int i=1,sum=0;
        System.out.println("The sum of natural numbers till : "+n);
     if(n>0){
          while(i<=n){
             sum=sum+i;
              i++;
            }
            System.out.println(sum);
        }
    }
}