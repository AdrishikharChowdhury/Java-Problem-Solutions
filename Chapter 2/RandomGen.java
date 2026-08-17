import java.util.Random;

public class RandomGen{
    public static void main(String[] args){
        Random rnd=new Random();

        int randNumber=rnd.nextInt(1,7);
        System.out.println(randNumber);

        double randDouble=rnd.nextDouble(1,7);
        System.out.println(randDouble);

        boolean isHeads=rnd.nextBoolean();
        
        if(isHeads){
            System.out.println("Its a HEADS");
        }
        else{
            System.out.println("Its a TAILS");
        }
    }
}