import java.util.Scanner;
public class Task112273{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), n = in.nextInt();
        int[] A = new int[n];
        for (int i = 0; i <= n - 1; i++){
            A[i] = x;
            x++;
        }
        for (int j = n - 1; j >= 1; j--){
            System.out.print(A[j] + " ");
        }
        System.out.print(A[0]);
    }
}
