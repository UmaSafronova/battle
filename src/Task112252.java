import java.util.Scanner;
public class Task112252{
    public static void f(int a){
        if (a == 1){
            System.out.print("YES");
        }
        else{
            if (a % 2 == 0){
                f(a / 2);
            }
            else{
                System.out.print("NO");
            }
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        f(a);
    }
}
