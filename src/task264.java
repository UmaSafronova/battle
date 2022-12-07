import java.util.Scanner;
public class task264{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        if (k == 0 || k == 1 || k == 2 || k == 4 || k == 7){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
