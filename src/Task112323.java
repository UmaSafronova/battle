import java.util.Scanner;
public class Task112323{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= n - 1; i++){
            int max = a[i];
            int k = i;
            for (int j = i; j <= n - 1; j++){
                if (a[j] > max){
                    max = a[j];
                    k = j;
                }
            }
            int t = a[i];
            a[i] = a[k];
            a[k] = t;
        }
        System.out.print(a[n / 2]);
    }
}
