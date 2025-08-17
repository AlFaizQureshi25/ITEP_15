class Employee{
    private int id;
    private int salary;
    private String name;

    public void SetId(int id ){
        this.id=id;
    }

    public void SetSalary(int salary){
        this.salary=salary;
    }

    public void SetName(String name){
        this.name=name;
    }

    public void display(){
        System.out.println(" Name \t\t\t Id \t\t\t Salary ");
        System.out.println(" "+name+" \t\t\t "+id+" \t\t\t "+salary);
    }
}
class TestMain{
    public static void main(String args[]){
        Employee info = new Employee();
        info.SetName("Karl");
        info.SetId(2040);
        info.SetSalary(230000);
        info.display();
    }
}