import java.util.Scanner;
public class Task112313{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= n - i - 2; j++){
                if (a[j] % 10 > a[j + 1] % 10){
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for (int i = 0; i <= n - 1; i++){
            System.out.print(a[i] + " ");
        }
    }
}
