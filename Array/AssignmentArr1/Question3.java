//Sum of Even Element and Odd Element in Arrays  
import java.util.Scanner;
 class Array{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of Array : ");
         int n=sc.nextInt();
          int arr[]=new int[n];
          int sume=0,sumo=0;
        for(int i=0;i<n;i++){
          System.out.println("Enter the "+(i+1)+" Element");
            arr[i]=sc.nextInt(); 
        }
        for(int i =0;i<n;i++) {
            if(arr[i]%2==0){
               sume+=arr[i];
            }else if (arr[i]%2!=0){
               sumo+=arr[i];
            }
        }
       System.out.println("The sum of even element is : "+sume+"\n"+" The sum of odd element is : "+sumo); 
    }
  }