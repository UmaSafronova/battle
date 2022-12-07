import java.util.Scanner;
public class Task112253{
    public static void f(int a, int d){
        if (a % d != 0){
            d = d - 1;
        }
        if (d >= 2){
            if (a % d == 0){
                System.out.print("NO");
            }
            else{
                f(a, d - 1);
            }
        }
        else{
            System.out.print("YES");
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int d = a - 1;
        f(a, d);
    }
}
