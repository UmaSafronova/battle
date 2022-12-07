import java.util.Scanner;
public class Task112294{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int m1 = 1000001;
        int m2 = 1000002;
        int m3 = 1000003;
        for (int i = 0; i <= n - 1; i++){
            if (a[i] < m3 && a[i] > m2){
                m3 = a[i];
            }
            if (a[i] <= m2 && a[i] > m1){
                int t = m2;
                m2 = a[i];
                m3 = t;
            }
            if (a[i] <= m1){
                int t = m1;
                int d = m2;
                m1 = a[i];
                m2 = t;
                m3 = d;
            }
        }
        System.out.print(m1 + " " + m2 + " " + m3);
    }
}
