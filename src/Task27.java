import java.util.Scanner;
public class Task27{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt(), b1 = in.nextInt();
        int a = Math.abs(a1);
        int b = Math.abs(b1);
        while (a * b != 0){
            if (a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if (b == 0){
            System.out.print(a1 / a + " " + b1 / a);
        }
        else{
            System.out.print(a1 / b + " " + b1 / b);
        }
    }
}
