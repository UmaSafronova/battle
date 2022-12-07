import java.util.Scanner;

public class Task2957 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int maximum;
        maximum = (a + b) / 2 - Math.abs(a - b) / 2;
        int minimum = a + b - maximum;
        System.out.println(minimum % maximum + 1);
    }
}
