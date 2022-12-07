import java.util.Scanner;
public class Task4{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[k];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= k - 1; i++){
            b[i] = in.nextInt();
        }
        for (int i = 0; i <= k - 1; i++){
            int key = b[i];
            int r = n - 1;
            int l = 0;
            while (r - l > 1){
                int m = (r + l) / 2;
                if (key > a[m]){
                    l = m;
                }
                else{
                    r = m;
                }
            }
            if (a[l] != key) {
                l = l + 1;
            }
            if (l <= n - 1){
                if (a[l] == key){
                    int ans1 = l + 1;
                    while (l <= n - 1 && a[l] == key){
                        l++;
                    }
                    int ans2 = l;
                    System.out.println(ans1 + " " + ans2);
                }
                else{
                    System.out.println(0);
                }
            }
            else{
                System.out.println(0);
            }
        }
    }
}
