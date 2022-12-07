import java.util.Scanner;
public class Task111835{
    static Scanner in = new Scanner(System.in);
    public static int f(int m, int n){
        if (m == 0){
            return n + 1;
        }
        if (m > 0 && n == 0){
            return f(m - 1, 1);
        }
        if (n > 0 && m > 0){
            return f(m - 1, f(m, n - 1));
        }
        else{
            return 0;
        }
    }
    public static void main(String[]args){
        int m = in.nextInt(), n = in.nextInt();
        System.out.print(f(m, n));
    }
}
