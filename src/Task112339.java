import java.util.Scanner;
public class Task112339{
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){
        String a = in.next();
        int n = a.length();
        char[] b = a.toCharArray();
        for (int i = 0; i <= n - 1; i++){
            if (b[i] != ' ' && b[i] != '.'){
                System.out.print(b[i]);
            }
            else{
                break;
            }
        }
    }
}
