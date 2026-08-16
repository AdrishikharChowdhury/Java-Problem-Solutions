import java.util.Scanner;

public class MadLibs{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lets play MadLibs");

        String[] adjectives=new String[5];
        String[] nouns=new String[7];

        for(int i=0;i<adjectives.length;i++){
            System.out.print("Enter adjective ["+(i+1)+"]: ");
            adjectives[i]=sc.nextLine();
        }

        for(int i=0;i<nouns.length;i++){
            System.out.print("Enter noun ["+(i+1)+"]: ");
            nouns[i]=sc.nextLine();
        }

        System.out.println("Here is your Madlib: ");
        System.out.println("Yesterday, a "+adjectives[0]+" "+nouns[0]+" found a "+adjectives[1]+" "+nouns[1]+" in the "+nouns[2]+". It started to jump near the "+nouns[3]+", making everyone feel "+adjectives[2]+". Soon, a "+adjectives[3]+" "+nouns[4]+" arrived with a huge "+nouns[5]+", and the whole "+nouns[6]+" turned "+adjectives[4]+"!");
        
    }
}