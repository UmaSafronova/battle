import java.util.Scanner;
public class Task2{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[k];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= k - 1; i++){
            b[i] = in.nextInt();
        }
        for (int i = 0; i <= k - 1; i++){
            int key = b[i];
            int r = n - 1;
            int l = 0;
            while (r - l > 1){
                int m = (r + l) / 2;
                if (key > a[m]){
                    l = m;
                }
                else{
                    r = m;
                }
            }
            if (a[r] - key >= key - a[l]){
                System.out.println(a[l] + " ");
            }
            else{
                System.out.println(a[r] + " ");
            }
        }
    }
}
