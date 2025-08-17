import java.util.Scanner;
 class Series{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term : ");
        int n =sc.nextInt();
        int i,c=1;
        System.out.println("The series is : ");
        for(i=1;n>=i;i++){
            System.out.println(c);
         c=c+i;
        }
    }
 }