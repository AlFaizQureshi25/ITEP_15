class Dog{
    private String name ;
    private String breed;

    public Dog(){}

    public Dog(String name,String breed){
        this.name= name;
        this.breed=breed; 
    }
    public void SetName(String name){
        this.name=name;
    }
    
    public void  SetBreed(String breed){
        this.breed=breed;
    }

    public void Display(){
        // System.out.println("Dog Name : "+name+"\tBreed : "+breed);
        System.out.printf("Dog Name : %-10s Breed : %s%n", name, breed);
    }
}

class Test{
    public static void main(String arg[]){
    Dog d1=new Dog("Tommy","German Shepard");
    Dog d2=new Dog("tyson","Pitbull");

    d1.Display();
    d2.Display();

    d1.SetName("toni");
    d2.SetBreed("indian");
    System.out.println("--------------------------------------");

    d1.Display();
    d2.Display();
    }
}