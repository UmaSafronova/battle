import java.util.Scanner;
public class Task112192{
    public static int f(int a, int b){
        while (a * b != 0){
            if (a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        return a + b;
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        System.out.print(f(a, b));
    }
}
