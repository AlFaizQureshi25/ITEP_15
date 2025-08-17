// Q.) Working eligibility.
import java.util.Scanner;
 class Q1{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
           
           System.out.println("Enter your age");
           int age;
           age =sc.nextInt();
           Boolean a=true;
           
          while(a){
                  if(age>0){
                  System.out.println("age : "+age);
                  a=false;
             } else {  
                  System.out.println("enter valid age");
                  age =sc.nextInt();
                 }
         
            }
            
           System.out.println("Enter your gender ");
           System.out.println("Choose F for female and M for male");
           char  choose=sc.next().charAt(0);
           Boolean b=true;
          while(b){
                  if(choose=='M'){
                  System.out.println("Gender : "+choose);
                  b=false;
             } else if (choose=='F') {  
                  System.out.println("Gender : "+choose);
                  b=false;
                 } else {
                     System.out.println("enter valid value : ");
                      choose=sc.next().charAt(0);
                 }
         
            }  


          System.out.println("Enter your Maritial status ");
          System.out.println("Choose M for married and S for Single");
           char  Status=sc.next().charAt(0);
           Boolean c=true;
          while(c){
                 if (Status=='M'){
                  System.out.println("Gender : "+Status);
                  c=false;
             } else if (Status=='S') {  
                  System.out.println("Gender : "+Status);
                  c=false;
                } else {
                     System.out.println("enter valid value : ");
                      Status=sc.next().charAt(0);
                }
         
            } 
            if(choose== 'F'){
                  System.out.println("You can work in urban");
              }else{
                  if((choose=='M')&&(age>20) && (age<40) ){
                        System.out.println("can work anywhere");
                    }else if ((choose=='M')&&(age<60) && (age>40)){
                        System.out.println("can work in urban");
                    }else{
                      System.out.println("error");
                     }
            }
            
     }
     
 }