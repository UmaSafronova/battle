import java.util.Scanner;
public class ToTheEnd{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int max = a[0];
        for (int i = 0; i <= n - 1; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        int[] b = new int[max + 1];
        for (int i = 0; i <= max; i++){
            b[i] = 0;
        }
        for (int i = 0; i <= max; i++){
            int s = 0;
            for (int j = 0; j <= n - 1; j++){
                if (a[j] == i){
                    s++;
                }
            }
            b[i] = s;
        }
        for (int i = 0; i <= max; i++){
            for (int j = 0; j <= b[i] - 1; j++){
                System.out.print(i + " ");
            }
        }
    }
}
