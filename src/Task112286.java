import java.util.Scanner;
public class Task112286{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
        int[] A = new int[n];
        int[] B = new int[n - 1];
        A[0] = (int) (Math.random() * (b - a)) + a;
        A[1] = (int) (Math.random() * (b - a)) + a;
        int s = A[0] + A[1];
        System.out.print(A[0] + " " + A[1] + " ");
        B[0] = s;
        for (int i = 2; i <= n - 2; i++){
            A[i] = (int) (Math.random() * (b - a)) + a;
            System.out.print(A[i] + " ");
            s = s - A[i - 2] + A[i];
            B[i - 1] = s;
        }
        A[n - 1] = (int) (Math.random() * (b - a)) + a;
        System.out.println(A[n - 1]);
        s = s - A[n - 3] + A[n - 1];
        B[n - 2] = s;
        int min = B[0];
        int ans1 = 1;
        int ans2 = 2;
        for (int i = 0; i <= n - 2; i++){
            if (B[i] <= min){
                min = B[i];
                ans1 = i + 1;
                ans2 = i + 2;
            }
        }
        System.out.print(ans1 + " " + ans2);
    }
}
