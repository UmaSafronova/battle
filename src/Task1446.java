import java.util.Scanner;
public class Task1446{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i <= n - 1; i++){
            b[i] = in.nextInt();
            a[i] = in.nextInt();
        }
        int t = 0;
        int t1 = 0;
        for (int i = 1; i <= n - 1; i++){
            t = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] < t){
                t = a[j + 1];
                t1 = b[j + 1];
                a[j + 1] = a[j];
                b[j + 1] = b[j];
                a[j] = t;
                b[j] = t1;
                j--;
            }
            while (j > 0 && a[j]== a[j + 1]) {
                if (b[j] > b[j + 1]){
                    t = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = t;
                }
                j--;
            }
        }
        for (int i = 0; i <= n - 1; i++){
            System.out.println(b[i] + " " + a[i]);
        }
    }
}
