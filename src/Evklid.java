import java.util.Scanner;
public class Evklid{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        while (a * b != 0){
            if (a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        System.out.print(a + b);
    }
}
