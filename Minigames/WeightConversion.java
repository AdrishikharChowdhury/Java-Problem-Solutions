import java.util.Scanner;

public class WeightConversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double givenWeight,calculatedWeight;
        int choice;

        System.out.println("Welcome to Weight Conversion Program");
        System.out.println("1: Kgs to Lbs");
        System.out.println("2: Lbs to Kgs");

        System.out.print("Your Choice: ");
        choice=sc.nextInt();


        if(choice==1){
            System.out.print("Enter weight (in kgs): ");
            givenWeight=sc.nextDouble();
            calculatedWeight=givenWeight*2.20462;
            System.out.printf("Resultant weight is %,.3f kgs\n",calculatedWeight);
        }
        else if(choice==2){
            System.out.print("Enter weight (in lbs): ");
            givenWeight=sc.nextDouble();
            calculatedWeight=givenWeight/2.20462;
            System.out.printf("Resultant weight is %,.3f lbs\n",calculatedWeight);
        }
        
        else{
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}