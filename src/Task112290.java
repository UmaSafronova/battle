import java.util.Scanner;
public class Task112290{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        int j = 0;
        for (int i = 0; i <= n - 1; i++){
            if (a[i] == k) {
                System.out.print((i + 1) + " ");
                j++;
            }
        }
        if (j == 0){
            System.out.print(-1);
        }
    }
}
