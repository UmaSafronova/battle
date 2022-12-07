import java.util.Scanner;
public class Task298{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if ((Math.abs(x2 - x1) == 1 || Math.abs(x2 - x1) == 0) && (Math.abs(y2 - y1) == 1 || Math.abs(y2 - y1) == 0))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
