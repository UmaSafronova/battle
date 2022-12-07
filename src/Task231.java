import java.util.Scanner;
public class Task231{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int k = in.nextInt(), index = in.nextInt();
        for (int i = n; i >= index; i--){
            a[i] = a[i - 1];
        }
        a[index - 1] = k;
        for (int i = 0; i <= n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
