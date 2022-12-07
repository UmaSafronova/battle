import java.util.Scanner;
public class Task112275{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        A[0] = 2;
        for (int i = 1; i <= n - 1; i++){
            A[i] = 2 * A[i - 1];
        }
        for (int j = n - 1; j >= 1; j--){
            System.out.print(A[j] + " ");
        }
        System.out.print(A[0]);
    }
}
