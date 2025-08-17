import java.util.Scanner;
class p4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
         int n=sc.nextInt();
         System.out.println("The Pattern : ");
         for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}