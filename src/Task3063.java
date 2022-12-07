import java.util.Scanner;
public class Task3063{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        x = 100 * x;
        double p = in.nextDouble();
        int y = in.nextInt();
        y = 100 * y;
        int k = 0;
        while (x < y){
            x += (p * x) / 100;
            k++;
        }
        System.out.print(k);
    }
}
