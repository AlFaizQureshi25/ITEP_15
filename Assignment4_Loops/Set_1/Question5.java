mport java.util.Scanner;
 class OddN{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int i=1;
        System.out.println("The odd number till "+n+" is");
        if(n>0){
           while(n>=i){
            if(i%2==1){
                System.out.println(i);
            }i++;
           }
        }
    }
 }