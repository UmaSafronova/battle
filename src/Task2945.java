import java.util.Scanner;

public class Task2945 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a - a % 2;
        System.out.println(b + 2);
    }
}
