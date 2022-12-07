import java.util.Scanner;
public class Task112314{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int k1 = -1;
        int k2 = -1;
        int k3 = -1;
        int min1 = 1000000;
        int min2 = 1000002;
        int min3 = 1000004;
        for (int i = 0; i <= n - 1; i++){
            if (a[i] < min3){
                if (a[i] < min2){
                    if (a[i] < min1){
                        min3 = min2;
                        min2 = min1;
                        min1 = a[i];
                        k3 = k2;
                        k2 = k1;
                        k1 = i;
                    }
                    else{
                        min3 = min2;
                        min2 = a[i];
                        k3 = k2;
                        k2 = i;
                    }
                }
                else{
                    min3 = a[i];
                    k3 = i;
                }
            }
        }
        System.out.print(min1 + " " + min2 + " " + min3 + " ");
        for (int i = 0; i <= n - 1; i++){
            if (i != k1 && i != k2 && i != k3){
                System.out.print(a[i] + " ");
            }
        }
    }
}
