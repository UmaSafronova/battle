import java.util.Scanner;
public class Task1436{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int t = 0;
        int s = 0;
        for (int i = 1; i <= n - 1; i++){
            t = a[i];
            int j = i - 1;
            s = 0;
            while (j >= 0 && a[j] > t){
                s += 1;
                t = a[j + 1];
                a[j + 1] = a[j];
                a[j] = t;
                j--;
            }
            if (s != 0){
                for (int l = 0; l <= n - 2; l++){
                    System.out.print(a[l] + " ");
                }
                System.out.println(a[n - 1]);
            }
        }
    }
}
