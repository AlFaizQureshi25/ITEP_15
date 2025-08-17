import java.util.Scanner;

class Profit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price and sell price: ");

        System.out.println("Cost price is : ");
        int costPrice = sc.nextInt();

        System.out.println("Selling Price is :  ");
        int sellPrice = sc.nextInt();

        if(costPrice > sellPrice){
            int loss = costPrice - sellPrice;
            System.out.println("Loss of "+ loss);
        } else {
            int profit = sellPrice - costPrice;
            System.out.println("Profit of "+ profit);
        }
    }
}