import java.util.Scanner;
public class Task112316{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int l = in.nextInt();
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= n - i - 2; j++){
                if (a[j] > a[j + 1]){
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        int s = 0;
        int i = 0;
        while (i <= n - 1){
            int k = 1;
            if (i != n - 1){
                while (a[i] == a[i + 1]){
                    k += 1;
                    i += 1;
                    if (i == n - 1){
                        break;
                    }
                }
            }
            if (k == l){
                System.out.print(a[i] + " ");
                s += 1;
            }
            i++;
        }
        if (s == 0){
            System.out.print(0);
        }
    }
}
