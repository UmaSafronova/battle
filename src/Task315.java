import java.util.Scanner;
public class Task315{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s;
        s = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println(s);
    }
}
