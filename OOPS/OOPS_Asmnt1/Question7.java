class Employee{
  private String name ;
  private String title;
  private int salary;

  public Employee(){}

  public Employee(String name,String title,int salary){
    this.name=name;
    this.title=title;
    this.salary=salary;
  }
   
   public void Update(Employee x,Employee z){
      this.salary=x.salary+z.salary;
      System.out.println("Calculated salary of "+x.name+" and  "+z.name+"is "+this.salary);
   }


 public void Display(){
      System.out.println("The Employee name "+this.name+" works as "+this.title+" has salary "+this.salary);
    }

}
 class Test{
    public static void main(String args[]){
    Employee obj1=new Employee("Abhay","Debugger",3450000);
    Employee obj2=new Employee("Shivam","CTO",2000000);
    Employee obj3=new Employee("Arjun","Tester",340000);
    Employee obj4=new Employee();
    obj4.Update(obj1,obj2);
  }
}