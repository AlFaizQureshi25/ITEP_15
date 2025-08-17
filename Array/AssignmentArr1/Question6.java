// Sort the Array .
import java.util.Scanner;
class Array{
 public static void main(String argd[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Size of Array : ");
      int n =sc.nextInt();
      int arr[]=new int[n];
      int temp=0;int i=0;int j=0;

       for(i=0;i<n;i++){
           System.out.println("Enter the "+(i+1)+" Element");
           arr[i]=sc.nextInt();
        }i =0;
       System.out.println("\n"+"Given data is .");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }  i=0;
     for(i=0;i<arr.length;i++){
         for(j=i+1;j<arr.length;j++){
              if(arr[i]>arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
        } i=0;
        System.out.println("\n\n"+"After sorting the array .");
       for(i=0;i<n;i++){
            System.out.print(arr[i]+",");
        } 
    }
}