import java.util.Scanner;

public class Sphere{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the radius of the spehre: ");
        double radius=sc.nextDouble();

        double perimeter=2*Math.PI*radius;
        double area=4*Math.PI*Math.pow(radius,2);
        double volume=4/3*Math.PI*Math.pow(radius,3);

        System.out.println("Results Of Sphere");
        System.out.println("Radius: "+radius+" units (Given)");
        System.out.println("Perimeter: "+perimeter+" units (Calculated)");
        System.out.println("Area: "+area+" square units (Calculated)");
        System.out.println("Volume: "+volume+" cubic units (Calculated)");
        
        sc.close();
    }
}