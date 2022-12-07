import java.util.Scanner;
public class Task112189{
    public static int f(int a, int b, int c){
        if (a > b){
            if (b > c){
                return c;
            }
            else{
                return b;
            }
        }
        else{
            if (a > c){
                return c;
            }
            else{
                return a;
            }
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out.print(f(a, b, c));
    }
}
