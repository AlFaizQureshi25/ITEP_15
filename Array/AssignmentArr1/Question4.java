// Element Not found
import java.util.Scanner;
class Find{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the Array size : ");
        int n =sc.nextInt();
        int arr[]=new int[n];int i=0;

      for (i=0;i<n;i++){
          System.out.println("Enter the "+(i+1)+" Element");
           arr[i]=sc.nextInt();
        } i=0;
          System.out.println("The Given data is : ");
         for(i=0;i<n;i++){
              System.out.print(arr[i]+" ");
            }
        System.out.println("\n\nEnter the Element : ");
        int elem=sc.nextInt();
        i=0;
       for(i=0;i<arr.length;i++){
         if(arr[i]==elem){
             System.out.println("Element found . ");
             break;
            }
           } if (i==arr.length){
           System.out.println("Element not found . ");
       } 
    }
}