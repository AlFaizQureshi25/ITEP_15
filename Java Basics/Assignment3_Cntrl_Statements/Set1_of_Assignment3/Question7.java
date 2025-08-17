// Q.) Exam Eligibilty Check Using attendence.
import java.util.Scanner;
  class Student{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
        
       System.out.println("Enter the days class held");
       float classheld=sc.nextFloat();
     
       System.out.println("enter you attendence : ");
       float attended;
       attended =sc.nextFloat();
       boolean a = true;
     while(a){
         if(attended<=classheld){
             System.out.println("class Attended="+attended); 
             a = false;  
         } else {
             System.out.println("enter the valid attendence");
             attended =sc.nextFloat();
            }
        }
         
     float attendence=((attended/classheld)*100.0f);
     System.out.printf("your attendence is= %.2f percent\n",attendence);

       if(attendence>=75)
                  System.out.println("you are elegible to sit in exam");
         else  
                   System.out.println("you are not eligible to sit");
    }
}