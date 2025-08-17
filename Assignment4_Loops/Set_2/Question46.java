import java.util.Scanner;
 class InterC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the Number :");
          int n=sc.nextInt();
          int last=0,first=0,temp=n,mid;
           int div=1;int i=1;
         
         for(i=1;temp>=10;i++){
            temp=temp/10;
            first=temp;
         }i=1;
         {temp=n;
           for(i=1;temp>=10;i++){
            temp/=10;
            div=div*10;
           }temp=n;
           mid=temp%div;
         }
         last=mid%10;
         mid/=10;
         System.out.println("the rev dig is : "+last+mid+first);
    }
 }