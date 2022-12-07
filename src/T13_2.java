import java.util.Scanner;
public class T13_2{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int s = 0;
        int k = 0;
        for (int i = 0; i <= n - 2; i++){
            A[i] = (int)Math.round(Math.random() * 100);
            if (A[i] % 2 == 0){
                s += 1;
                if (A[i] % 3 == 0){
                    k += 1;
                }
            }
            System.out.print(A[i] + " ");
        }
        A[n - 1] = (int)Math.round(Math.random() * 100);
        if (A[n - 1] % 2 == 0){
            s += 1;
            if (A[n - 1] % 3 == 0){
                k += 1;
            }
        }
        System.out.println(A[n - 1] + " ");
        int[] B = new int[n + k];
        int i = 0;
        int d = 0;
        while (i <= n + k - 1){
            B[i] = A[d];
            System.out.print(B[i] + " ");
            if (A[d] % 6 == 0){
                i++;
                B[i] = s;
                System.out.print(B[i] + " ");
            }
            d++;
            i++;
        }
    }
}
