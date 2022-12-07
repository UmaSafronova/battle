import java.util.Scanner;
public class Task112255{
    static Scanner in = new Scanner(System.in);
    public static void f(int a, int max){
        int b = in.nextInt();
        if (b != 0){
            if (b > max){
                max = b;
            }
            f(b, max);
        }
        else{
            System.out.print(max);
        }
    }
    public static void main(String[]args){
        int a = in.nextInt();
        int max = a;
        f(a, max);
    }
}
