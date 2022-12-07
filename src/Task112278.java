import java.util.Scanner;
public class Task112278{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
        int[] A = new int[n];
        int s = 0;
        for (int i = 0; i <= n - 2; i++){
            A[i]= (int) (Math.random() * (b - a)) + a;
            if (A[i] % 1000 == A[i] && A[i] % 100 != A[i] && A[i] % 5 != 0 && A[i] > 0){
                s++;
            }
            System.out.print(A[i] + " ");
        }
        A[n - 1] = (int) (Math.random() * (b - a)) + a;
        if (A[n - 1] > 0 && A[n - 1] % 1000 == A[n - 1] && A[n - 1] % 100 != A[n - 1] && A[n - 1] % 5 != 0){
            s++;
        }
        System.out.println(A[n - 1]);
        System.out.print(s);
    }
}
