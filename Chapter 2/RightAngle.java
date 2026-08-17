import java.util.Scanner;

public class RightAngle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Lets Find the Hypotenuse of a Triangle using Pythagoras Theorem");

        System.out.print("Enteer side 1 length: ");
        double side1=sc.nextDouble();

        System.out.print("Enter side 2 length: ");
        double side2=sc.nextDouble();
        double hypotenuse=Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));

        System.out.println("The hypotenuse of the triangle is "+hypotenuse);

        System.out.println("Now Let's Calculate its area");

        double halfperimeter=(side1+side2+hypotenuse)/2;
        double area=Math.sqrt(halfperimeter*(halfperimeter-side1)*(halfperimeter-side2)*(halfperimeter-hypotenuse));

        System.out.println("Its area is "+area);
        sc.close();
    }
}