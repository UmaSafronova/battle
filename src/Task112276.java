import java.util.Scanner;
public class Task112276{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 3){
            int[] A = new int[n];
            A[0] = 1;
            A[1] = 1;
            System.out.print(A[0] + " " + A[1] + " ");
            for (int i = 2; i <= n - 2; i++) {
                A[i] = A[i - 1] + A[i - 2];
                System.out.print(A[i] + " ");
            }
            int l = A[n - 3] + A[n - 2];
            System.out.print(l);
        }
        if (n == 1){
            System.out.print(1);
        }
        if (n == 2){
            System.out.print(1 + " " + 1);
        }
    }
}
