import java.util.Scanner;
public class Task112367{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                a[i][j] = in.nextInt();
            }
        }
        int min = 10000000;
        int ans = -1;
        for (int i = 0; i <= n - 1; i++){
            int s = 0;
            for (int j = 0; j <= m - 1; j++){
                s += a[i][j];
            }
            if (s <= min){
                min = s;
                ans = i;
            }
        }
        for (int i = 0; i <= m - 1; i++){
            System.out.print(a[ans][i] + " ");
        }
    }
}
