import java.util.Scanner;
public class Task112227{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int b = 1;
        if (n >= 2){
            System.out.print(1 + " " + 1 + " ");
            for (int i = 1; i <= n - 2; i++){
                int c = a;
                a = b;
                b = b + c;
                System.out.print(b + " ");
            }
        }
        else{
            System.out.print(1);
            }
    }
}
