// Sum of element of Array
import java.util.Scanner;
 class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          System.out.println("enter the size of Array");
           int n=sc.nextInt();
           int arr[]=new int[n];
           int sum=0;
       for(int i=0;i<n;i++){
        System.out.println("Enter the "+(i+1)+" Element");
          arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
        sum+=arr[i];
       }System.out.println("The sum of array is "+sum);

        
    }
 }