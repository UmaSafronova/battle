import java.util.Scanner;
public class Task112211{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int k = 0;
        if (a <= 0 && b >= 0){
            System.out.print(0 + " ");
            k += 1;
        }
        if (a <= 1 && b >= 1){
            System.out.print(1 + " ");
            k += 1;
        }
        if (a <= 5 && b >= 5){
            System.out.print(5 + " ");
            k += 1;
        }
        if (a <= 6 && b >= 6){
            System.out.print(6 + " ");
            k += 1;
        }
        if (a <= 25 && b >= 25){
            System.out.print(25 + " ");
            k += 1;
        }
        if (a <= 76 && b >= 76){
            System.out.print(76 + " ");
            k += 1;
        }
        if (a <= 376 && b >= 376){
            System.out.print(376 + " ");
            k += 1;
        }
        if (a <= 625 && b >= 625){
            System.out.print(625 + " ");
            k += 1;
        }
        if (a <= 9376 && b >= 9376){
            System.out.print(9376 + " ");
            k += 1;
        }
        if (a <= 90625 && b >= 90625){
            System.out.print(90625 + " ");
            k += 1;
        }
        if (a <= 109376 && b >= 109376){
            System.out.print(109376 + " ");
            k += 1;
        }
        if (a <= 890625 && b >= 890625){
            System.out.print(890625 + " ");
            k += 1;
        }
        if (a <= 2890625 && b >= 2890625){
            System.out.print(2890625 + " ");
            k += 1;
        }
        if (a <= 7109376 && b >= 7109376){
            System.out.print(7109376 + " ");
            k += 1;
        }
        if (a <= 12890625 && b >= 12890625){
            System.out.print(12890625 + " ");
            k += 1;
        }
        if (a <= 87109376 && b >= 87109376){
            System.out.print(87109376 + " ");
            k += 1;
        }
        if (a <= 212890625 && b >= 212890625){
            System.out.print(212890625 + " ");
            k += 1;
        }
        if (a <= 787109376 && b >= 787109376){
            System.out.print(787109376 + " ");
            k += 1;
        }
        if (a <= 1787109376 && b >= 1787109376){
            System.out.print(1787109376 + " ");
            k += 1;
        }
        if (k == 0){
            System.out.println(-1);
        }
    }
}
