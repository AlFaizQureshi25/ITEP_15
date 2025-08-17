import java.util.Scanner;
 class Tax{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
 
      System.out.println("Enter the cost of bike  :");
      float cost=sc.nextFloat();

      if(100000<cost){
           System.out.println("15  percent Tax");
     }else{
          if((1000000>cost)&& (50000<cost)){
               System.out.println("10 percent tax");
           }else {
                System.out.println("5 percent tax");
            }
 
        }


    }

 }