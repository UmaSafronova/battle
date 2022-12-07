import java.util.Scanner;
public class Task3067{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int k = 0;
        int d = 1;
        do {
            int n = in.nextInt();
            if (n % 2 == 0){
                k++;
            }
            d = n;
        } while (d != 0);
        System.out.print(k - 1);
    }
}
