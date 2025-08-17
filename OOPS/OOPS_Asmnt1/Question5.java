class Circle{
    private float r;
    public Circle(){}

    public Circle(float r){
        this.r=r;
    }
    public float Area(){
        float  area = 3.14f*(this.r*this.r);
        return area;
    }
    public float Circumference(){
        float cir=2*3.14f*this.r;
        return cir;
    }
      public void SetRadius(float r){
         this.r=r;
      }
     public void GetRadius(){
         System.out.println("The Radius is : "+this.r);
    }
     public void Display(float area, float circ){
       System.out.println("The area is : "+area);
       System.out.println("The Circumference is : "+circ);
    }
}
class Test{
    public static void main(String args[]){
        Circle c1=new Circle(3);
        c1.GetRadius();
        float  area =c1.Area();
        float  circ=c1.Circumference();
        c1.Display(area, circ);

    }
}