import java.util.Scanner;
public class Task112229{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                s += i;
            }
        }
        if (s == n){
            for (int i = 1; i < n; i++){
                if (n % i == 0){
                    System.out.print(i + " ");
                }
            }
        }
        else{
            System.out.print(0);
        }
    }
}
