import java.util.Scanner;
public class Task321{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double s = 0;
        double i = 0;
        while (i <= n){
            if (i % 2 == 0){
                s += 1 / (2 * i + 1);
            }
            else{
                s -= 1/(2 * i + 1);
            }
            i += 1;
        }
        System.out.print(4 * s);
    }
}
