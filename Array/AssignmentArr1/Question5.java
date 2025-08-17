// replace MUltiple of 5 in Array with 0 .
import java.util.Scanner;
class Array{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Size of Array : ");
      int n =sc.nextInt();
      int arr[]= new int[n];

     for(int i=0;i<n;i++){
        System.out.println("Enter the "+(i+1)+" Element");
         arr[i]=sc.nextInt();
        }
     for(int i=0;i<n;i++){
         if(arr[i]%5==0){
            arr[i]=0;
          }
        } System.out.println("Updated Data is .");
     for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}