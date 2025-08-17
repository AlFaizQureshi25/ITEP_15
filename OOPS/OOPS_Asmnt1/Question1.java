class Time{
    private int s;
    private int h;
    private int m;
    
    public Time(){}
    public Time(int h,int m,int s){
        this.s=s;
        this.h=h;
        this.m=m;
    }
   public Time Add(Time x){
     Time temp=new Time();
     temp.h=this.h+x.h;
     temp.m=this.m+x.m;
     temp.s=this.s+x.s;

      if(temp.s>60){
          temp.s=temp.s%60;
          temp.m++;
         }
         if(temp.m>60){
             temp.m=temp.m%60;
             temp.h++;
            }
        return temp;
    }

    public void Display(){
        System.out.println(h+" Hour "+m+" minutes "+s+" Seconds");
    }
}

class Test{
    public static void main (String args[]){
     Time t1= new Time(2,23,34);
     Time t2=new Time(3,45,42);
     Time res =t1.Add(t2);
     res.Display(); 
    }
}