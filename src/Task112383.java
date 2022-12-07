import java.util.Scanner;
public class Task112383{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= n - 1; j++){
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i <= n - 1; i++){
            for (int j = i; j <= n - 1; j++){
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }
        for (int j = 0; j <= n - 1; j++){
            for (int i = 0; i <= (n - 1) / 2; i++){
                int t = a[i][j];
                a[i][j] = a[n - i - 1][j];
                a[n - i - 1][j] = t;
            }
        }
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= n - 1; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
