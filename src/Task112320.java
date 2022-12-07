import java.util.Scanner;
public class Task112320{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int l = 0;
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= n - 1; i++){
            int s = 0;
            for (int j = n - i - 1; j >= 1; j--){
                if (a[j] < a[j - 1]){
                    s += 1;
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
            if (s != 0){
                l += 1;
                for (int j = 0; j <= n - 2; j++){
                    System.out.print(a[j] + " ");
                }
                System.out.println(a[n - 1]);
            }
        }
        if (l == 0){
            for (int i = 0; i <= n - 1; i++){
                System.out.print(a[i] + " ");
            }
        }
    }
}
