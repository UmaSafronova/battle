import java.util.Scanner;
public class Task259{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 4 == 0 || n == 1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
