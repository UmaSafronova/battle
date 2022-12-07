import java.util.Scanner;
public class Task3071{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int max = 0;
        int max1 = 0;
        int d = 1;
        do {
            int n = in.nextInt();
            if (n >= max1){
                if (max >= n){
                    max1 = n;
                }
                else{
                    max1 = max;
                    max = n;
                }
            }
            d = n;
        } while (d != 0);
        System.out.print(max1);
    }
}
