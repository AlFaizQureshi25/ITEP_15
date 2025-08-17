import java.util.Scanner;
class Q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size :");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements of Array : ");
        for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
     
    for(int i=n-1;i>=0;i--){
        int temp=0;
        for(int j=0;j<n;j++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        
        System.out.print(arr[i]);}
    }
        System.out.println("The reverse of entered array is : ");
          
              }
    }
