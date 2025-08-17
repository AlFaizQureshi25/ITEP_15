// pending
import java.util.Scanner;
class Q18{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the Size of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int l=0,g=0;int i =0;int j=0;int temp=0;
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
        } i=0;
        System.out.println("\nEnter the Number : ");
         int num=sc.nextInt();

     while (i<arr.length){
           if(num<arr[i]){
              System.out.println("There is no lesser element but greater element then number is "+arr[i]);
              break;
           }else if(num>arr[i]){
                i++;
           }else if((num==arr[i])||(num>arr[i]&&num<arr[i+1])){
               g=arr[i+1];
               l=arr[i-1];
              System.out.println("The element greater and lesser then number is "+g+" and "+l);     
              break;
            }
            if(i==arr.length-1){
                System.out.println("There is no greater element but lesser element is :"+arr[i]);
                break;
            }
        }
    }
}