import java.util.Scanner;

public class AreaofRectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Let's Calculate the area of a rectangle");

        System.out.print("Enter the length: ");
        double length=sc.nextDouble();

        System.out.print("Enter the width:");
        double width=sc.nextDouble();

        double area=length*width;
        System.out.println("The area of the rectangle is "+area);
    }
}