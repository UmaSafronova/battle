import java.util.Scanner;
public class Task112321{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int[] b = new int[n / 2];
        int[] c = new int[n / 2];
        for (int i = 0; i < n / 2; i++){
            b[i] = a[i];
        }
        for (int i = n / 2; i <= n - 1; i++){
            c[i - n / 2] = a[i];
        }
        for (int i = 0; i <= n / 2 - 1; i++){
            for (int j = 0; j <= n / 2 - i - 2; j++){
                if (b[j] > b[j + 1]){
                    int t = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = t;
                }
            }
        }
        for (int i = 0; i <= n / 2 - 1; i++){
            for (int j = 0; j <= n / 2 - i - 2; j++){
                if (c[j] < c[j + 1]){
                    int t = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = t;
                }
            }
        }
        for (int i = 0; i <= n / 2 - 1; i++){
            System.out.print(b[i] + " ");
        }
        for (int i = 0; i <= n / 2 - 1; i++){
            System.out.print(c[i] + " ");
        }
    }
}
