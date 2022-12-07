import java.util.Scanner;
public class Task112182{
    public static void f(long a){
        if (a < 0){
            System.out.print("-");
        }
        a = Math.abs(a);
        if (a >= 2){
            f(a / 2);
            System.out.print(a % 2 + "");
        }
        else{
            System.out.print(a % 2 + "");
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        f(a);
    }
}
