import java.util.Scanner;
  class DMart{
    public static void main(String args[]){
       Scanner sc =new  Scanner(System.in);
           System.out.println("\"WELCOME to D-MART\"");
           System.out.println("Enter you name and Gender");

            String name=sc.next();
            String gender =sc.next();


             float CostOfP1=10, CostOfP2=20,CostOfP3=30,CostOfP4=40 , CostOfP5=50 , CostOfP6=60 ;
             float CostOfP7=70 , CostOfP8=80 , CostOfP9=90 , CostOfP10=100;
            
            System.out.println("Hello!  "+name);
            
             System.out.println("Enter the product name And its Quantity  one by one : ");

            String product1= sc.next(); int Quantity1 = sc.nextInt();  float price1= (CostOfP1*Quantity1);
            System.out.println("product 1 is "+product1+"\nQuantity is  :  "+Quantity1+"\n Its Total price is : "+price1);
          
           String product2= sc.next(); int Quantity2 = sc.nextInt(); float price2= (CostOfP2*Quantity2);
            System.out.println("product 2 is  "+product2+"\n and its Quantity is  :  "+Quantity2+"\n Its Total price is : "+price2);
        
            String product3= sc.next(); int Quantity3 = sc.nextInt(); float price3= (CostOfP3*Quantity3);
            System.out.println("product 3  is  "+product3+"\n and its Quantity is  :  "+Quantity3+"\n Its Total price is : "+price3);
        
            String product4= sc.next(); int Quantity4 = sc.nextInt(); float price4= (CostOfP4*Quantity4);
            System.out.println("product 4 is "+product4+"\n and its Quantity is  :  "+Quantity4+"\n Its Total price is : "+price4);
                    
            String product5= sc.next(); int Quantity5 = sc.nextInt();  float price5= (CostOfP5*Quantity5);
            System.out.println("product 5 is  "+product5+"\n and its Quantity is  :  "+Quantity5+"\n Its Total price is : "+price5);
          
            String product6= sc.next(); int Quantity6 = sc.nextInt(); float price6= (CostOfP6*Quantity6);
            System.out.println("product  6 is  "+product6+"\n and its Quantity is  :  "+Quantity6+"\n Its Total price is : "+price6);
          
            String product7= sc.next(); int Quantity7 = sc.nextInt(); float price7= (CostOfP7*Quantity7);
            System.out.println("product 7  is  "+product7+"\nand its Quantity is  :  "+Quantity7+"\n Its Total price is : "+price7);
             
            String product8= sc.next(); int Quantity8 = sc.nextInt(); float price8= (CostOfP8*Quantity8);
            System.out.println("product 8 is  "+product8+"\nand its Quantity is  :  "+Quantity8+"\n Its Total price is : "+price8);

            String product9= sc.next(); int Quantity9 = sc.nextInt(); float price9= (CostOfP9*Quantity9);
            System.out.println("product 9 is "+product9+"\nand its Quantity is  :  "+Quantity9+"\n Its Total price is : "+price9);

            String product10= sc.next(); int Quantity10 = sc.nextInt(); float price10= (CostOfP10*Quantity10);
             float dic=(price10*0.15f);price10 = price10-dic;
            System.out.println("product 10 is "+product10+"\nand its Quantity is  :  "+Quantity10+"\n Its Total price is : "+price10);
             
             if( Quantity1 > 4){
                float dis1;
                dis1=(5/100.f)*price1;
                price1=price1-dis1;
             }
             
              float dis2,total5;
              total5=(price1+price2+price3+price4+price5);
               dis2=(10/100.0f)*total5;
               total5=total5-dis2;
             
             float total10,dis3;
             total10=total5+price6+price7+price8+price9+price10;
             System.out.println("the bill is"+total10);
         
    }


  }