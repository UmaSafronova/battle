import java.util.Scanner;
public class Task112386_1{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                a[i][j] = in.nextInt();
            }
        }
        int k = in.nextInt();
        int[] b = new int[n];
        for (int i = 0; i <= n - 1; i++){
            b[i] = a[i][k - 1];
        }
        int[] c = new int[n];
        for (int i = 0; i <= n - 1; i++){
            c[i] = i;
        }
        for (int i = 0; i <= n - 2; i++){
            for (int j = 0; j <= n - (i + 2); j++){
                if (b[j] >= b[j + 1]){
                    int t = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = t;
                    int t1 = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = t1;
                }
            }
        }

    }
}
