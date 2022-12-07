import java.util.Scanner;
public class Task256{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if (((x2 - x1 == y2 - y1) || (x2 - x1) == -1 * (y2 - y1)) || ((x1 == x2) || (y1 == y2)))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
