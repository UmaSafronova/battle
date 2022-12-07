import java.util.Scanner;
public class Task112226{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 1;
        int i = 0;
        while (n / k != 0){
            k *= 10;
            i += 1;
        }
        while (k != 1){
            System.out.print((n % k) / (k / 10) + " ");
            k /= 10;
        }
    }
}
