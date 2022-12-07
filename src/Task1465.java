import java.util.Scanner;
public class Task1465{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int n = 0;
        int r = 1;
        while (r != 0){
            if (a >= b){
                n += a / b;
                a = a % b;
            }
            else {
                n += b / a;
                b = b % a;
            }
            if (a == 0){
                r = 0;
            }
            if (b == 0){
                r = 0;
            }
        }
        System.out.print(n);
    }
}
