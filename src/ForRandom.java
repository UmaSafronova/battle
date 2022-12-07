import java.util.Scanner;
import java.util.Random;
public class ForRandom{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random(10);
        int x = rand.nextInt(100);
        System.out.println(x);
    }
}
