import java.util.Scanner;
public class Task120{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double s = 1.0;
        double pr = 1.0;
        for (int i = 1; i <= n; i += 1){
            s += 1 / pr;
            pr *= (i + 1);
        }
        String result = String.format("%.5f", s);
        System.out.println(result);
    }
}
