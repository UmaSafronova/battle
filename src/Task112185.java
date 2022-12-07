import java.util.Scanner;
public class Task112185{
    public static void f(long a, long b){
        if (a < 0){
            System.out.print("-");
        }
        a = Math.abs(a);
        if (a >= b){
            f(a / b, b);
            System.out.print(a % b + "");
        }
        else{
            System.out.print(a % b + "");
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong(), b = in.nextLong();
        f(a, b);
    }
}
