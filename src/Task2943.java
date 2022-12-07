import java.util.Scanner;

public class Task2943 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = (a / 10) % 10;
        System.out.println(b);
    }
}
