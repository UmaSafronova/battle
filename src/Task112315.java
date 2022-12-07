import java.util.Scanner;
public class Task112315{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= n - i - 2; j++){
                if (a[j] > a[j + 1]){
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        int k = 1;
        for (int i = 1; i < n; i++){
            if (a[i] > a[i - 1]){
                k++;
            }
        }
        for (int i = 0; i <= n - 2; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n - 1]);
        System.out.print(k);
    }
}
