import java.util.Scanner;
public class Task304{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a, b, c;
        a = n / 60;
        b = (n % 60) / 10;
        c = n % 10;
        if (c * 15 > 125){
            c = 0;
            b = b + 1;
        }
        if (c * 15 + b * 125 > 440){
            c = 0;
            b = 0;
            a = a + 1;
        }
        System.out.println(c + " " + b + " " + a);
    }
}
