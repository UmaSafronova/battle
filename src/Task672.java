import java.util.Scanner;
public class Task672{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int max = 0;
        for (int i = 0; i <= n - 1; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        int l = 0;
        int r = max;
        while (r - l > 1){
            int m = (r + l) / 2;
            int s = 0;
            for (int i = 0; i <= n - 1; i++){
                s += a[i] / m;
            }
            if (s >= k){
                l = m;
            }
            else{
                r = m;
            }
        }
        int s = 0;
        for (int i = 0; i <= n - 1; i++){
            s += a[i] / r;
        }
        if (s >= k){
            System.out.print(r);
        }
        else{
            System.out.print(l);
        }
    }
}
