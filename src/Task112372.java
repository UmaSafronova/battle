import java.util.Scanner;
public class Task112372{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                if ((i + j) % 2 == 0){
                    a[i][j] = 0;
                }
                else{
                    a[i][j] = 1;
                }
            }
        }
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= m - 1; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
