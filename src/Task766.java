import java.util.Scanner;
public class Task766{
    public static int[] merge_sort(int[] a, int n){
        if (n > 1){
            int lb, lc;
            int[] b = new int[n / 2];
            lb = n / 2;
            int[] c = new int[n / 2 + 1];
            if (n % 2 != 0) {
                lc = n / 2 + 1;
            }
            else{
                lc = n / 2;
            }
            for (int i = 0; i <= lb - 1; i++){
                b[i] = a[i];
            }
            for (int i = 0; i <= lc - 1; i++){
                c[i] = a[i + n / 2];
            }
            return merge(merge_sort(b, lb), lb, merge_sort(c, lc), lc);
        }
        else{
            return a;
        }
    }

    public static int[] merge(int[] a, int la, int[] b, int lb){
        int k = 0;
        int l = 0;
        int index = 0;
        int[] c = new int[la + lb];
        while (k <= la - 1 || l <= lb - 1){
            if (k <= la - 1 && l <= lb - 1){
                if (a[k] < b[l]){
                    c[index] = a[k];
                    index++;
                    k++;
                }
                else{
                    c[index] = b[l];
                    index++;
                    l++;
                }
            }
            if (k == la && l <= lb - 1){
                c[index] = b[l];
                l++;
                index++;
            }
            if (k <= la - 1 && l == lb){
                c[index] = a[k];
                k++;
                index++;
            }
        }
        return c;
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int[] b = merge_sort(a, n);
        for (int i = 0; i <= n - 1; i++){
            System.out.print(b[i] + " ");
        }
    }
}
