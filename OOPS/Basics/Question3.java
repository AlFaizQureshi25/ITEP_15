class BankAccount{
    private int Ac_no;
    private int balance;
    private String name;

    public void SetAc_No(int Ac_no){
        this.Ac_no=Ac_no;
    }

    public void SetBalance(int balance){
        this.balance=balance;
    }

    public void SetName(String name){
        this.name=name;
    }

    public void display(){
        System.out.println("NAME \t\t\t A/C Number \t\t\t Balance");
        System.out.println(name+"\t\t "+Ac_no+" \t\t\t"+balance);
    }
}

class Test{
    public static void main(String args[]){
        BankAccount person=new BankAccount();
        person.SetAc_No(0504023);
        person.SetName("Yahpal Singh");
        person.SetBalance(12000 );
        person.display();
    }
}