import java.util.Scanner;
public class Task320{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double s = 0;
        double i = 1;
        while (i <= n){
            s += 1 / (i * i);
            i++;
        }
        System.out.print(s);
    }
}
