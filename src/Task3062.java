import java.util.Scanner;
public class Task3062{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int b = in.nextInt();
        int k = 0;
        while (a < b){
            a = 1.1 * a;
            k++;
        }
        System.out.print(k + 1);
    }
}
