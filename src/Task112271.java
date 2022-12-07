import java.util.Scanner;
public class Task112271{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), d = in.nextInt(), n = in.nextInt();
        int[] A = new int[n];
        int k = x;
        for (int i = 0; i <= n - 2; i++){
            A[i] = k;
            k += d;
            System.out.print(A[i] + " ");
        }
        A[n - 1] = k;
        System.out.print(A[n - 1]);
    }
}
