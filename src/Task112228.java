import java.util.Scanner;
public class Task112228{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int s = 0;
        for (int i = a; i <= b; i++){
            int k = 0;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    k = 1;
                    break;
                }
            }
            if (k == 0){
                System.out.println(i);
                s += 1;
            }
        }
        if (s == 0){
            System.out.print("Absent");
        }
    }
}
