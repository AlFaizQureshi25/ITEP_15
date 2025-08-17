class Rectangle{
    private int len;
    private int bth;

    public Rectangle(){}
    public Rectangle(int len,int bth){
        this.len=len;
        this.bth=bth;
    }

    public int Area(){
        int area=0;
         area=this.len*this.bth;
        return area;
    }

    public  int Perameter(){
        int pera=0;
        pera=2*(this.len+this.bth);
        return pera;
    }

    public void Display(int area , int para){
        System.out.println("Area = "+area+" Perameter = "+para);
    }
}
class Test{
    public static void main(String args[]){
        Rectangle r1=new Rectangle(23,10);
        int area=r1.Area();
        int pera=r1.Perameter();
        r1.Display(area,pera);
    }
}