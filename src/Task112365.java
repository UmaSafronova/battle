import java.util.Scanner;
public class Task112365{
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
        int r = in.nextInt();
        int ans = 0;
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                int s = 0;
                int k1 = 0;
                int b = a[i][j];
                while (b > 0){
                    s += b % 10;
                    b = b / 10;
                    k1 += 1;
                }
                if (k1 == k && s % r == 0){
                    ans += 1;
                }
            }
        }
        System.out.print(ans);
    }
}
