import java.util.Scanner;
public class WhileA{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k1 = 1;
        int s1 = 0;
        while (n >= k1) {
            s1 += (n / k1) % 10;
            k1 *= 10;
        }
        System.out.print(s1);
    }
}
