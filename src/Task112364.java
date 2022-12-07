import java.util.Scanner;
public class Task112364{
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
        int s = 0;
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                if (a[i][j] == k){
                    s++;
                }
            }
        }
        System.out.print(s);
    }
}
