import java.util.Scanner;

public class Task112145 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        double ans;
        System.out.println(a + "+" + b + "+" + c + "=" + (a + b + c));
        System.out.println(a + "*" + b + "*" + c + "=" + a * b * c);
        double a1 = a + 0.1 - 0.1;
        double b1 = b + 0.1 - 0.1;
        double c1 = c + 0.1 - 0.1;
        ans = (a1 + b1 + c1) / 3;
        System.out.print("(" + a + "+" + b + "+" + c + ")/3" + "=");
        System.out.printf("%.3f", ans);
    }
}
