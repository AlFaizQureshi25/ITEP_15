class Q1{
    public static void main(String arg[]){
        int pera=230,b=70;
        float area,l;
        l=(pera/2)-70.0f;
        System.out.println("l="+l);
        area=l*b;
        System.out.println("area="+area);
        
        
        
    }
    
}
class Q2{
    public static void main(String arg[]){
        int area=96,b=8;
        float pera,l;
        l=area/b;
        System.out.println("l="+l+"cm");
        pera=2*(l+b)-70.0f;
        System.out.println("pera="+pera+"cm");
        
    
        
    }
    
}
class Q3{
    public static void main(String arg[]){
        int tileLength=13,tileBreadth=7,fLength=520,fBreadth=140;
        float flArea,tlArea ,tilesNeeded;
        tlArea=tileLength*tileBreadth;
        flArea=fLength*fBreadth;
        tilesNeeded=flArea/tlArea;
        System.out.println("tlArea="+tlArea);
        System.out.println("flArea="+flArea);
        System.out.println("tilesNeeded="+tilesNeeded);
        
        
        
    }
    
}
class Q4{
    public static void main(String arg[]){
        int l=300,w=150;
        int areaSquaremeter,cost;
        // cost =6$per Square meter
        areaSquaremeter=l*w;
        cost=areaSquaremeter*6;
        System.out.println("areaSquaremeter="+areaSquaremeter);
        System.out.println("cost="+cost+"$");
        
        
        
    }
    
}
class Q5{
    public static void main(String arg[]){
        int l=20,cost=25,tPrice=1600;
        float area,pera,b;
       /* fencing total cost=1600rs,cost=25 rs per meter,*/
        pera=1600/25.0f;
        b=(pera/2)-20;
        area=l*b;
        System.out.println("area="+area);
        System.out.println("b="+b);
        System.out.println("pera="+pera);
        
        
        
    }
    
}
class Q6{
    /*Q14. Quadrilateral Area*/
    public static void main (String args[]){
    int d=46,ALT1=13,ALT2=10;
    float ABCD,ABC,BCD;
    ABC=((d*ALT1)*0.5f);
    BCD=((d*ALT2)*0.5f);
    ABCD=ABC+BCD;
    System.out.println("AREA="+ABCD);
        
    }
    
}
class Q7{
    /*Q15.Area comparision*/
    public static void main (String args[]){
    int SquareArea,rectArea,l=22,b=15,s=21;
    rectArea=l*b;
    SquareArea=s*s;
    if(rectArea>SquareArea){
        System.out.println("Shelly's Garden is Bigger");
    } else{
    System.out.println("Racheal's Garden is bigger ");
    }  
        
    }
    }
    class Q8{
        /*Q9. Area of equilateral triangle*/
    public static void main (String args[]){
     float Area,s=12;
    /*Area of Equilateral Triangle=(squareroot(3)/4)*(s*s)
    We will take value of Squareroot(3)=1.732*/
    Area=(float)(((1.732/4)*(s*s)));
    System.out.println("Area="+Area+"sm square");
    }  
    }
    class Q9 {
    public static void main(String args[]){
        int cube,cartoon,s=3,l=15,b=9,h=12;
        float NOB;
        cube=(s*s*s);
        cartoon=(l*b*h);
        NOB=(cartoon/cube);
        System.out.println("NO of Cubic Boxes="+NOB);  
        
    }
    
}
class Q10{
    public static void main(String args[]){
        int l=25,h=10;
        int l1=20*100,b1=2*100;
        double h1=0.75*100,b=7.5,NOB,COW,brick,wall,cost=0.9;
        /* cost of brick=$900 per thousand bricks so per brick=$0.9 */
        brick=(l*b*h);
        wall=(l1*b1*h1);
        NOB=(wall/brick);
        COW=(NOB*cost);
        System.out.println("brick volume="+brick+"/ per cm cube");
        System.out.println("Wall volume="+wall+" per cm cube");
        System.out.println("No of Bricks in Wall="+NOB);
        System.out.println("Cost of Wall="+COW+"$");
        
   
    }
    
}