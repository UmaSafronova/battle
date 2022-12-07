import java.util.Scanner;
public class Task112318{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= n - i - 2; j++){
                if (a[j] > a[j + 1]){
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for (int i = n - 1; i >= 1; i--){
            if (a[i] == a[i - 1]){
                System.out.print(a[i]);
                break;
            }
            if (i == 1){
                System.out.print(-1);
            }
        }
    }
}
