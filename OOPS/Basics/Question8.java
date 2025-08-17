class Circle{
    private float radius;
    private float area;
    private float cf;
    private float pie=3.14f;

    public void SetRadius(float radius){
        this.radius=radius;
    }

    public void Area(){
        this.area=pie*(radius*radius);
    }

    public void Circumference(){
        this.cf=2*pie*radius;
    }
     public void display(){
        System.out.println("The area is : "+area);
        System.out.printf("this circumference is  %.2f",cf);
    }
}

class Test{
    public static void main(String args[]){
        Circle c1=new Circle();
        c1.SetRadius(5.0f);
        c1.Area();
        c1.Circumference();
        c1.display();
    }
}