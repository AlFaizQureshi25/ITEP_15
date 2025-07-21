class Q11 {
    public static void main(String args[]){
     int l=24,b=15,area, path;
     area=(l*b);
     path=(area*100);
        System.out.println("area of a brick="+area+" per cm square");
        System.out.println("path area="+path+" per cm square");
        
        
    }
    
}
class Q12 {
    public static void main(String args[]){
     int l=24,b=15,area;
     double path,l1=120*100,b1=2.4*100,bricksRequired;
     area=(l*b);
     path=(l1*b1);
     bricksRequired=(path/area);
        System.out.println("area of a brick="+area+" per cm square");
        System.out.println("path area="+path+" per cm square");
        System.out.println("no of bricks required="+bricksRequired);
        
        
    }
    
}
class Q13{
    public static void main(String args[]){
     int l=800,b=900,s=10,floorarea,square;
     double tilesRequired;
     floorarea=(l*b);
     square=(s*s);
     tilesRequired=(floorarea/square);
        System.out.println("tile area="+square+" per cm square");
        System.out.println("floor area="+floorarea+" per cm square");
        System.out.println("no of tiles required="+tilesRequired);
        
        
    }
    
}
class Q14{
    public static void main(String args[]){
     int s1=150,square1,s2=25,square2,area;
     square1=(s1*s1);
     square2=(s2*s2);
     area=(square1-square2);
        System.out.println("Garden area="+area+" per meter square");
        
    }
    
}
class Q15 {
    public static void main(String args[]){
     int l=30,b=20,p1width=3,p2width=4,ul,ub;
     float area;
     ul=l-p2width;
     ub=b-p1width;
     area=ul*ub;
    System.out.println("Garden area="+area+" per meter square");
        
    }
    
}
class Q16 {
    public static void main(String args[]){
     int b=128,h=40,a=92,sideway;
     double area,newarea;
     area= 0.5*(b+a)*h;
     sideway=h*4;
     newarea=area+sideway;
        System.out.println("Garden area="+area+" per meter square");
        System.out.println("updated area="+newarea);
    }
    
}

class Q17 {
    public static void main (String Args[]){
      int area=500,b=50;
      float h;
        h=(area*2)/50;
        System.out.println("height="+h);
}
    
}

class Q18{
    public static void main(String args[]){
     float r=7.7f,h=12.0f,pie=3.141f;
     float area;
     area=(float)(2*(pie)*r*h)+(2*(pie)*(r*r));
        System.out.println("cylender area="+area+" per meter square");
        
    }
    
}
class Q19 {
    public static void main (String Args[]){
      int area,l=5,b=7;
      area=l*b;
      System.out.println("area="+area);
}
    
}
class Q20{
 public static void main (String args[]){
     int area=80,altitude=20;
     float b;
     b=(area*2)/20;
     System.out.println("Breadth="+b);
     
 }   
    
}