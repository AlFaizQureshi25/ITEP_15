import java.util.Scanner;
class PerfectNo{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i ,sum =0;
      for(i=0;i<=n;i++){
          if(n%2==0)
          sum=+i;
      }if(sum == n){
          System.out.println("That is a perfect no");
        }else{
          System.out.println("This is not a perfect no.");
        }
    }
}