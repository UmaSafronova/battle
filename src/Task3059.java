import java.util.Scanner;
public class Task3059{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i = i * 2){
            System.out.print(i + " ");
        }
    }
}
