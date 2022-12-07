import java.util.Scanner;
public class Task3801{
    static Scanner in = new Scanner(System.in);
    public static void f(int a, int b){
        if (a == 0){
            System.out.print(b);
        }
        else{
            f(a - 1, b + 1);
        }
    }
    public static void main(String[]args){
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b){
            int t = a;
            a = b;
            b = t;
        }
        f(a, b);
    }
}
