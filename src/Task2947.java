import java.util.Scanner;

public class Task2947 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        min = min % 1440;
        int h = min / 60;
        int min1 = min % 60;
        System.out.println(h + " " + min1);
    }
}
