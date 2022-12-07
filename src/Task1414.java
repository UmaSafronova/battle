import java.util.Scanner;
public class Task1414{
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){
        int n = in.nextInt();
        System.out.print(1 + " ");
        if (n >= 2){
            System.out.print(2 + " ");
            if (n > 2){
                int a = 2;
                while (a < n){
                    System.out.print("-" + (a - 1) + " ");
                    System.out.print((a + 1) + " ");
                    a++;
                }
            }
            for (int i = n - 2; i >= 1; i--){
                System.out.print(i + " ");
            }

        }
    }
}
