import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.print("What's your age? : ");
        int age=sc.nextInt();

        System.out.print("What is the price of Project Hail Mary by Andy Weir: ");
        double price=sc.nextDouble();

        System.out.print("Can You Afford it? (true/false): ");
        boolean canAfford=sc.nextBoolean();
        
        System.out.println("Hello, "+name+". You are "+age+" years old");
        System.out.println("Project Hail Mary costs "+price+" Rs. only");
        if (canAfford) {
            System.out.println("You can afford it!");
        } else {
            System.out.println("You cannot afford it.");
        }
        sc.close();
    }
}
