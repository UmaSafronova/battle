import java.util.Scanner;
public class Task112293{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int min = 10001;
        int max = 0;
        for (int i = 0; i <= n - 1; i++){
            if (a[i] > 0 && a[i] % 2 == 0){
                if (a[i] < min){
                    min = a[i];
                }
                if (a[i] > max){
                    max = a[i];
                }
            }
        }
        if (min != 10001){
            System.out.print(min + " " + max);
        }
        else{
            System.out.print(-1 + " " + -1);
        }
    }
}
