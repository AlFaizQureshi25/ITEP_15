class Rectangle{
    private float length;
    private float breadth;
    private float area;

    public void SetLength(float length){
        this.length=length;
    }
    public void SetBreadth(float breadth){
        this.breadth=breadth;
    }
    public void Area(){
        this.area=length*breadth;
    }
    public void GetArea(){
        System.out.println("The area of Rectangle is : "+area+" Cm Square");
    }
}
class Test{
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        r1.SetLength(20);
        r1.SetBreadth(14);
        r1.Area();
        r1.GetArea();
    }
}