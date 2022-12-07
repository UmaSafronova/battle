import java.util.Scanner;
public class Task3068{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int max = 0;
        int d = 1;
        do {
            int n = in.nextInt();
            if (n >= max){
                max = n;
            }
            d = n;
        } while (d != 0);
        System.out.print(max);
    }
}
