import java.util.Scanner;
public class Task112317{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int s = 0;
        for (int i = 0; i <= n - 1; i++){
            for (int j = 0; j <= n - i - 2; j++){
                if (a[j] > a[j + 1]){
                    s += 1;
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    for (int k = 0; k <= n - 2; k++){
                        System.out.print(a[k] + " ");
                    }
                    System.out.println(a[n - 1]);
                }
            }
        }
        if (s == 0){
            System.out.print(0);
        }
    }
}
