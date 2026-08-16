public class Variables{
    public static void main(String[] args){
        // There are 2 types of variables in java
        // Primitive & Reference variables
        // Variable: It is a container for a value to be reused and acts like the value it contains

        // Primitive: Simple value stored directly in the stack
        // Reference: memory address(stack) that points to the (heap)
        
        // Primitve vs Reference
        //    int       string
        //    double    array
        //    char      object
        //    boolean
        // 
        // Steps:
        // 1. Declare
        // 2. Assign

        int age=21;
        int year=2026;
        int quantity=1;

        System.out.println("The year is "+year);

        double price=99.99;
        double gpa=7.87;
        double tempreature=-4.5;

        System.out.println("The price of this book is "+price+" Rs. only");

        char grade='A';
        char symbol='?';
        char currency='$';

        System.out.println(currency);

        boolean isStudent=true;
        boolean isSale=false;

        System.out.println(isStudent);

        if(isStudent){
            System.out.println("I am a student");
        }
        else{
            System.out.println("I am not a student");
        }

        if(isSale){
            System.out.println("Sale is Live, Shop more!!!");
        }
        else{
            System.out.println("Sale is Over. Come back Later");
        }

        String name="Adrishikhar Chowdhury";
        System.out.println("Hello, "+name+". How are you?");
    }
}