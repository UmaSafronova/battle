import java.util.Scanner;
public class Task112324{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= ((n - 1) / 2) * 2; i++){
            if (i % 2 == 0){
                int min = a[i];
                int k = i;
                for (int j = i; j <= ((n - 1) / 2) * 2; j++){
                    if (j % 2 ==0){
                        if (a[j] < min){
                            min = a[j];
                            k = j;
                        }
                    }
                }
                int t = a[i];
                a[i] = a[k];
                a[k] = t;
            }
        }
        for (int i = 0; i <= n - 1; i++){
            System.out.print(a[i] + " ");
        }
    }
}
