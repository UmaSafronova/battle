import java.util.Scanner;
public class Task112298{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            A[i] = in.nextInt();
        }
        int k = n / 2;
        for (int i = 0; i < n / 2; i++) {
            int t = A[i];
            A[i] = A[n - i - 1];
            A[n - i - 1] = t;
        }
        for (int i = k; i <= n - 1; i++){
            B[i] = A[i - k];
        }
        for (int i = 0; i <= k - 1; i++){
            B[i] = A[n - k + i];
        }
        for (int i = 0; i <= n - 1; i++){
            System.out.print(B[i] + " ");
        }
    }
}
