import java.util.Scanner;
public class Task112322{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();
        int i = 0;
        while (i != k - 1){
            System.out.print(a[i] + " ");
            i++;
        }
        if (d == 1){
            for (int j = k - 1; j <= m - 1; j++){
                int min = a[j];
                int index = j;
                for (int l = j; l <= m - 1; l++){
                    if (a[l] < min){
                        min = a[l];
                        index = l;
                    }
                }
                int t = a[j];
                a[j] = min;
                a[index] = t;
            }
        }
        else{
            for (int j = k - 1; j <= m - 1; j++){
                int max = a[j];
                int index = j;
                for (int l = j; l <= m - 1; l++){
                    if (a[l] > max){
                        max = a[l];
                        index = l;
                    }
                }
                int t = a[j];
                a[j] = max;
                a[index] = t;
            }
        }
        for (int j = k - 1; j <= m - 1; j++){
            System.out.print(a[j] + " ");
        }
        for (int j = m; j <= n - 1; j++){
            System.out.print(a[j] + " ");
        }
    }
}
