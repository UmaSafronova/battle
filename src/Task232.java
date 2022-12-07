import java.util.Scanner;
public class Task232{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int t = 0;
        for (int i = 1; i <= n - 1; i++){
            t = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > t){
                t = a[j + 1];
                a[j + 1] = a[j];
                a[j] = t;
                j--;
            }
        }
        for (int i = 0; i <= n - 1; i++){
            System.out.print(a[i] + " ");
        }
    }
}
