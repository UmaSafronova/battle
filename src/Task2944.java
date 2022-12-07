import java.util.Scanner;

public class Task2944 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int a1 = a / 100;
        int a2 = a / 10 - a1 * 10;
        int a3 = a % 10;
        System.out.println(a1 + a2 + a3);
    }
}
