import java.util.Scanner;
public class Task112368{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                a[i][j] = in.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                if (a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        for (int i = 0; i <= m - 1; i++){
            for (int j = 0; j <= n - 1; j++){
                if (a[j][i] == max){
                    for (int k = 0; k <= n - 1; k++){
                        System.out.print(a[k][i] + " ");
                    }
                    System.out.println("");
                    break;
                }
            }
        }
    }
}
