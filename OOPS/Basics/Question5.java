class Product{
    private String  name;
    private int id;
    private int price;
    private int quantity;

    public void SetName(String name){
        this.name=name;
    }

    public void SetID(int id){
        this.id=id;
    }

    public void SetPrice(int price){
        this.price=price;
    }

    public void SetQuantity(int quantity){
        this.quantity=quantity;
    }

    public void display(){
        System.out.println("Product Name \t\t   Product I_D \t\t Price \t\t Quantity \t\t Total Price");
        System.out.println(name+"\t\t\t   "+id+"\t\t   "+price+"\t\t   "+quantity+"\t\t\t   "+price*quantity);
    }
}

class Test{
    public static void main(String args[]){
        Product p1=new Product();
        p1.SetID(120230);
        p1.SetQuantity(4);
        p1.SetPrice(1200);
        p1.SetName("Bottle");
        p1.display();
    }
}