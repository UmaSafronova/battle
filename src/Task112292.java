import java.util.Scanner;
public class Task112292{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int min = a[0];
        for (int i = 1; i <= n - 1; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        for (int i = 0; i <= n - 1; i++){
            if (a[i] == min){
                System.out.print((i + 1) + " ");
            }
        }
    }
}
