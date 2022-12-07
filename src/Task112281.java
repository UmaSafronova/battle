import java.util.Scanner;
public class Task112281{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
        int[] A = new int[n];
        int s = 0;
        int max = -1;
        for (int i = 0; i <= n - 2; i++){
            A[i] = (int) (Math.random() * (b - a)) + a;
            System.out.print(A[i] + " ");
            if (A[i] > 0 && A[i] % 2 == 0){
                if (max < A[i]){
                    max = A[i];
                }
            }
        }
        A[n - 1] = (int) (Math.random() * (b - a)) + a;
        System.out.println(A[n - 1]);
        if (A[n - 1] > 0 && A[n - 1] % 2 == 0){
            if (max < A[n - 1]){
                max = A[n - 1];
            }
        }
        System.out.print(max);
    }
}
