class Q26{
    public static void main(String args[]){
        int l=15,b=8,h=5,brick,wall;
        int l1=15*100;
        int b1=10*100; 
        int h1=8*100;
        float bricksneeded;
     brick=(l*b*h);
     wall=(l1*b1*h1);
     bricksneeded=(float)(wall/brick);
           System.out.println("brick size="+brick+"cm");
           System.out.println("wall size="+wall+"cm");
           System.out.println("No of bricks needed="+bricksneeded);
       }
           
       
 }    
