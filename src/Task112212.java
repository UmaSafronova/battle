import java.util.Scanner;
public class Task112212{
    public static int f(int n){
        int k = 1;
        int sum = 0;
        while (n / (k) != 0){
            if (((n % (k * 10)) / k) % 2 == 0){
                sum += 1;
            }
            k *= 10;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(f(a));
    }
}
