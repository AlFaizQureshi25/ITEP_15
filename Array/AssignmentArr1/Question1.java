// Print N number of Element in Array.
import java.util.Scanner;
class Array{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int arr[]= new int[n];
       for(int i=0;i<n;i++){
        System.out.println("Enter the "+(i+1)+" Element");
        arr[i]=sc.nextInt();
       }
        System.out.println("Given data is .");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}