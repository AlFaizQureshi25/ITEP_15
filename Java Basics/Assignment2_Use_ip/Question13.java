import java.util.Scanner;
class  Triangle {
    public static void main(String args[]){
        /*
        let one side as base and the other side as height 
         */
        int sideOne, area, sideTwo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side one: ");
        sideOne = sc.nextInt();
        System.out.print("Enter area: ");
        area = sc.nextInt();
        sideTwo = (int)((area*2)/sideOne);
        System.out.println("other side = "+sideTwo);
    }
}