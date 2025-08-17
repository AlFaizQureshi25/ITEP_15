import java.util.Scanner;
class p5{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n =sc.nextInt();
      System.out.println("The Pattern : ");
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              System.out.print(j+1);
            }   System.out.println();
        }

    }
}