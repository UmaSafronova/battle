import java.util.Scanner;
public class Task112193{
    public static int f(int a, int b){
        int a2 = a;
        int b2 = b;
        while (a * b != 0){
            if (a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        return a2 * b2 / (a + b);
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        System.out.print(f(a, b));
    }
}
