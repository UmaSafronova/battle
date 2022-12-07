import java.util.Scanner;
public class Task112280{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt(), k = in.nextInt();
        int[] A = new int[n];
        int s = 0;
        int s1 = 0;
        int d = 0;
        for (int i = 0; i <= n - 2; i++){
            A[i] = (int) (Math.random() * (b - a)) + a;
            System.out.print(A[i] + " ");
            s1 = 0;
            d = 10;
            while (A[i] / (d / 10) != 0){
                s1 += (A[i] / (d / 10)) % 10;
                d = d * 10;
            }
            if (s1 == k){
                s++;
            }
        }
        A[n - 1] = (int) (Math.random() * (b - a)) + a;
        System.out.println(A[n - 1]);
        s1 = 0;
        d = 10;
        while (A[n - 1] / (d / 10) != 0) {
            s1 += (A[n - 1] / (d / 10)) % 10;
            d = d * 10;
        }
        if (s1 == k){
            s++;
        }
        System.out.print(s);

    }
}
