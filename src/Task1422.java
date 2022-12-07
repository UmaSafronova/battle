import java.util.Scanner;
public class Task1422{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong(), b = in.nextLong();
        long a1 = a, b1 = b;
        while (a1 * b1 != 0){
            if (a1 > b1){
                a1 = a1 % b1;
            }
            else{
                b1 = b1 % a1;
            }
        }
        System.out.print(a * b / (a1 + b1));
    }
}
