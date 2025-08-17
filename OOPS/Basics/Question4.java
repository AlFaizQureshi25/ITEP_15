class Car{
    private int year;
    private String brand;
    private String model;

    public void SetYear(int year){
        this.year=year;
    }

    public void SetModel(String model){
        this.model=model;
    }

    public void SetBrand(String brand){
        this.brand=brand;
    }

    public void display(){

        System.out.println("Car Brand \t\t Model \t\tYear ");
        System.out.println(brand+"\t\t\t  "+model+"\t\t"+year);
    }
}

class Test{
    public static void main(String agrs[]){
        Car info=new Car();
        info.SetYear(2012);
        info.SetModel("ZEX1");
        info.SetBrand("Bently");
        info.display();
    }
}