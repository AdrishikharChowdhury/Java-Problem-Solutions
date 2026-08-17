import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        if(age<0){
            System.out.println("Born first, then enter age");
        }

        else if(age>=18){
            System.out.println("You are an adult");
        }
        if(age>=65){
            System.out.println("You are a senior");
        }
        else if(age==0){
            System.out.println("Your a baby");
        }
        else{
            System.out.println("You are a child");
        }
        sc.close();
    }
}