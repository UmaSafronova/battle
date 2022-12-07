import java.util.Scanner;
public class Task257{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if ((Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2) || (Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}