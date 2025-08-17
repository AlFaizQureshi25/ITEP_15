class Person{
    private String name;
    private int age;

    public Person(){}
    
    public Person(String name ,int age){
        this.age=age;
        this.name=name;
    }

    public void Display(){
        System.out.println("Name : "+name+"    Age : "+age);
    }
}

class TestMain{
    public static void main(String args[]){
       Person p1=new Person("Ajay",21);
       Person p2=new Person("Ayan",34);
       p1.Display();
       p2.Display();
    }
}