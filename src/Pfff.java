import java.util.Scanner;
public class Pfff{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= n - 1; i++){
            int f = i;
            for (int j = 0; j <= n - 1; j++){
                if (a[j] > a[f]){
                    f = j;
                }
            }
            int t = a[i];
            a[i] = a[f];
            a[f] = t;
        }
        for (int i = 0; i <= n - 1; i++){
            System.out.print(a[i] + " ");
        }
    }
}
