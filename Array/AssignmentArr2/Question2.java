//Print Greatest and Smallest Element of Array.
import java.util.Scanner;
class Q2{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Array Size");
       int n=sc.nextInt();int i=0,j=0,temp=0;
       int arr[]=new int[n];

       System.out.println("Enter the Elements of Array : ");
     for(i=0;i<n;i++){
           arr[i]=sc.nextInt();
        } i=0;
     for(i=0;i<arr.length;i++){
         for(j=i+1;j<arr.length;j++){
              if(arr[i]>arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
        } i=0;
        System.out.println("The minimum element of array is"+arr[0]);
        System.out.println("The Maximum Element of Array is "+arr[arr.length-1]);
    }
}