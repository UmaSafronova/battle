import java.util.Scanner;
public class Task301{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double D = 0;
        if (b * b - 4 * a * c >= 0){
            D = Math.sqrt(b * b - 4 * a * c);
            if (D > 0){
                System.out.println((-1 * b + D) / (2 * a) + " " + (-1 * b - D) / (2 * a));
            }
            else{
                System.out.println(-1 * b / (2 * a));
            }
        }
    }
}
