import java.util.Scanner;
public class T13_3{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int c2 = 0;
        int c = 0;
        for(int i = 0; i < n; i++) {
            A[i]= (int) Math.round ((Math.random() * 100 ));

        }
        for( int j = 0; j < n; j++) {
            System.out.print(A[j] + " ");

        }
        for( int j = 0; j < n-1; j++) {
            if (A[n - j] > A[n - j - 1]) {
                System.out.print(n - j);
            }
        }
    }
}
