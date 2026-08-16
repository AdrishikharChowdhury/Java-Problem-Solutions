import java.util.Scanner;

public class ShoppingCart{
    public static void main(String[] args){
        char currency='₹';
        Scanner sc = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item=sc.nextLine();

        System.out.print("What's the price of "+item+"?: ");
        double price=sc.nextDouble();

        System.out.print("How many "+item+"/s would you like?: ");
        int quantity=sc.nextInt();

        double total=price*quantity;

        System.out.println("\nYou have bought "+quantity+" "+item+"/s");
        System.out.println("Your total is "+currency+total);
        sc.close();
    }
}