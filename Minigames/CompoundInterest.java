import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double principle,rate;
        int years,timesCompounded=1;

        System.out.print("Enter the principle amount: ");
        principle=sc.nextDouble();

        System.out.print("Enter the rate of Interest: ");
        rate=sc.nextDouble()/100;

        System.out.print("Enter the number of years: ");
        years=sc.nextInt();

        System.out.print("Enter the # times compounded in a year: ");
        timesCompounded=sc.nextInt();

        double totalAmount=principle*Math.pow((1+(rate/timesCompounded)),years*timesCompounded);
        double interestAmount=totalAmount-principle;
        System.out.printf("The Total Amount after %d years is ₹%,.2f\n",years,totalAmount);
        System.out.printf("The amount of interest is ₹%,.2f\n",interestAmount);

        sc.close();
    }
}