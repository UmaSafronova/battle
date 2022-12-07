import java.util.Scanner;
public class Task112319{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= n - i - 2; j++){
                int k1 = 1;
                int s1 = 0;
                while (a[j] >= k1){
                    s1 += (a[j] / k1) % 10;
                    k1 *= 10;
                }
                int k2 = 1;
                int s2 = 0;
                while (a[j + 1] >= k2){
                    s2 += (a[j + 1] / k2) % 10;
                    k2 *= 10;
                }
                if (s1 < s2){
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
