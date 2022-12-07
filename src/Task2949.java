import java.util.Scanner;

public class Task2949 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }
}
