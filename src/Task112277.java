import java.util.Scanner;
public class Task112277{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
        int[] A = new int[n];
        int s = 0;
        for (int i = 0; i <= n - 2; i++){
            A[i]= (int) (Math.random() * (b - a)) + a;
            if ((A[i] / 10) % 2 == 0){
                s++;
            }
            System.out.print(A[i] + " ");
        }
        A[n - 1] = (int) (Math.random() * (b - a)) + a;
        if ((A[n - 1] / 10) % 2 == 0){
            s++;
        }
        System.out.println(A[n - 1]);
        System.out.print(s);
    }
}
