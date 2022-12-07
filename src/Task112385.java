import java.util.Scanner;
public class Task112385{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                a[i][j] = in.nextInt();
            }
        }
        float S = 0;
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                S += a[i][j];
            }
        }
        float s = S / (n * m);
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                if (a[i][j] < s){
                    a[i][j] = 0;
                }
                else{
                    a[i][j] = 255;
                }
            }
        }
        System.out.printf("%.4f", s);
        System.out.println("");
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
