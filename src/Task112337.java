import java.util.Scanner;
public class Task112337{
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){
        String a = in.next();
        int n = a.length();
        String b = a.replace('A', 'B');
        b = b.replace('a', 'b');
        char[] c = a.toCharArray();
        int k = 0;
        for (int i = 0; i <= n - 1; i++){
            if (c[i] == 'a'){
                k++;
            }
            if (c[i] == 'A'){
                k++;
            }
        }
        System.out.println(b);
        System.out.println(k);
    }
}
