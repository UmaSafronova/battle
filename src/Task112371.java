import java.util.Scanner;
public class Task112371{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                a[i][j] = in.nextInt();
            }
        }
        int[] b = new int[n];
        int[] c = new int[m];
        int k = 0;
        for (int i = 0; i <= n - 1; i++){
            int min = 10000000;
            for (int j = 0; j <= m - 1; j++){
                if (a[i][j] < min){
                    min = a[i][j];
                }
            }
            b[i] = min;
        }
        for (int i = 0; i <= m - 1; i++){
            int max = 0;
            for (int j = 0; j <= n - 1; j++){
                if (a[j][i] > max){
                    max = a[j][i];
                }
            }
            c[i] = max;
        }
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                if (a[i][j] == b[i] && a[i][j] == c[j]){
                    k++;
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
        if (k == 0){
            System.out.print(0);
        }
    }
}
