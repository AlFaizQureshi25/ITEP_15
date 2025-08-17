class Result{
    private String name ;
    private float math;
    private float sceince;
    private float average;
    public void SetName(String name){
        this.name=name;
    }
    public void SetMaths(float math){
        this.math=math;
    }
    public void SetSceince(float sceince){
        this.sceince=sceince;
    }

    public void getAverage(){
       this.average=(math+sceince/2.0f);
    }
    public void display(){
        System.out.println("Name \t\t\t MAths Score \t\t Sceince Score \t\t Average ");
        System.out.println(name+"\t\t\t   "+math+"\t\t\t  "+sceince+"\t\t\t  "+average);
    }
}

class Test{
    public static void main(String args[]){
      Result p1=new Result();
     p1.SetName("Carlito");
     p1.SetMaths(65.0f);
     p1.SetSceince(85.0f);
     p1.getAverage();
     p1.display();
    }
}