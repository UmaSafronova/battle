import java.util.Scanner;
public class Task112270{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int[] A = new int[b];
        int d = a;
        for (int i = 0; i <= b - 2; i++){
            A[i] = d;
            System.out.print(d + " ");
            d++;
        }
        System.out.print(a + b - 1);
    }
}
