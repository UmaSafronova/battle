import java.util.Scanner;
public class Task112369{
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
            for (int j = n - 1; j >= i + 1; j--){
                a[i][j] = 0;
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
