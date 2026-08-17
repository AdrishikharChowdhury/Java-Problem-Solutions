import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double givenTemp, calculatedTemp;
        String tempUnit, calculatedUnit;

        System.out.print("Enter the temperature: ");
        givenTemp = sc.nextDouble();

        System.out.print("Enter the unit of the temperature (C/F): ");
        tempUnit = sc.next().toUpperCase();

        calculatedTemp = tempUnit.contains("F")
            ? (5.0 / 9.0) * (givenTemp - 32)
            : ((9.0 / 5.0) * givenTemp) + 32;
        calculatedUnit = tempUnit.contains("C") ? "F" : "C";

        System.out.printf("The Resultant Temperature is %.2f %s\n", calculatedTemp,calculatedUnit);

        sc.close();
    }
}
