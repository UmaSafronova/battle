import java.util.Scanner;
public class Task112267{
    public static int f(int a){
        int max = 0;
        while (a > 0){
            if (a % 10 > max){
                max = a % 10;
            }
            if (max == 9){
                break;
            }
            a = a / 10;
        }
        return max;
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(f(a));
    }
}
