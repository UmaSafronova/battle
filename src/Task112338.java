import java.util.Scanner;
public class Task112338{
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){
        String a = in.next();
        int n = a.length();
        char[] c = a.toCharArray();
        int k = 0;
        for (int i = 0; i <= n - 1; i++){
            if (c[i] == 'a'){
                System.out.print('b');
                k++;
            }
            if (c[i] == 'A'){
                System.out.print('B');
                k++;
            }
            if (c[i] == 'B'){
                System.out.print('A');
                k++;
            }
            if (c[i] == 'b'){
                System.out.print('a');
                k++;
            }
            if (c[i] != 'a' && c[i] != 'A' && c[i] != 'b' && c[i] != 'B'){
                System.out.print(c[i]);
            }
        }
        System.out.println("");
        System.out.println(k);
    }
}
