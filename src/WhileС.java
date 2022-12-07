import java.util.Scanner;
public class WhileС{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double s = 0;
        int k = 0;
        int d = 1;
        do {
            int n = in.nextInt();
            d = n;
            k++;
            s += n;
        } while (d != 0);
        System.out.print(s / (k - 1));
    }
}
