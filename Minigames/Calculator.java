import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, ans;
        String operator;
        boolean isContinue = true;

        do {
            ans = 0;
            System.out.println("Welcome to The Calculator Program");

            System.out.print("Enter your first number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter the operator (+,-,*,%,^):");
            operator = sc.next();

            System.out.print("Enter your second number: ");
            num2 = sc.nextDouble();

            switch (operator) {
                case "+" -> ans = num1 + num2;
                case "-" -> ans = num1 - num2;
                case "*" -> ans = num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                        return;
                    }
                    ans = num1 / num2;
                }
                case "%" -> ans = num1 % num2;
                case "^" -> ans = Math.pow(num1, num2);
                default -> System.out.println("Invalid Operator");
            }

            System.out.println("Your Ans. is " + ans);

            System.out.print("Do you want to continue? (y/n): ");
            String choice = sc.next().toUpperCase();
            isContinue = choice.equals("Y") ? true : false;
        } while (isContinue);
        System.out.println("Thank you for using the program");
        sc.close();
    }
}
