import java.util.Scanner;
public class Task112296{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int max = 1;
        int maxans = a[0];
        int s = 1;
        int ans = a[0];
        for (int i = 1; i <= n - 1; i++){
            if (a[i] == ans){
                s++;
            }
            else{
                s = 1;
                ans = a[i];
            }
            if (s > max){
                max = s;
                maxans = a[i];
            }
        }
        System.out.print(maxans + " " + max);
    }
}
