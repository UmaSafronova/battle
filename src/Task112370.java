import java.util.Scanner;
public class Task112370{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= n - 1; j++){
                a[i][j] = in.nextInt();
            }
        }
        int y = 0;
        for (int i = 0; i <= n - 1; i++){
            for (int j = n - 1; j >= i + 1; j--){
                if (a[i][j] != a[j][i]){
                    y = 1;
                    break;
                }
            }
            if (y == 1){
                break;
            }
        }
        if (y == 1){
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}
