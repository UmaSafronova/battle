import java.util.Scanner;
public class Task111837{
    static Scanner in = new Scanner(System.in);
    public static long f(long n){
        if (n == 1){
            return 1;
        }
        else{
            if (n == 2){
                return 1;
            }
            else{
                return f(n - 1) + f(n - 2);
            }
        }
    }
    public static void main(String[]args){
        long n = in.nextLong();
        System.out.print(f(n) / 1000000000);
    }
}
