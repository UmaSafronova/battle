import java.util.Scanner;
public class Task146{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt(), b1 = in.nextInt(), c1 = in.nextInt(), d1 = in.nextInt();
        int a = Math.abs(a1);
        int b = Math.abs(b1);
        int c = Math.abs(c1);
        int d = Math.abs(d1);
        while (a * b != 0){
            if (a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        while (c * d != 0){
            if (c > d){
                c = c % d;
            }
            else{
                d = d % c;
            }
        }
        int k1;
        int k2;
        if (a > b){
            if (c > d){
                k1 = (a1 / a) * (d1 / c) + (c1 / c) * (b1 / a);
                k2 = (b1 / a) * (d1 / c);
            }
            else{
                k1 = (a1 / a) * (d1 / d) + (c1 / d) * (b1 / a);
                k2 = (b1 / a) * (d1 / d);
            }
        }
        else{
            if (c > d){
                k1 = (a1 / b) * (d1 / c) + (c1 / c) * (b1 / b);
                k2 = (b1 / b) * (d1 / c);
            }
            else{
                k1 = (a1 / b) * (d1 / d) + (c1 / d) * (b1 / b);
                k2 = (b1 / b) * (d1 / d);
            }
        }
        int k11 = k1;
        int k21 = k2;
        while (k1 * k2 != 0){
            if (k1 > k2){
                k1 = k1 % k2;
            }
            else{
                k2 = k2 % k1;
            }
        }
        if (k1 > k2){
            System.out.print(k11 / k1 + " " + k21 / k1);
        }
        else{
            System.out.print(k11 / k2 + " " + k21 / k2);
        }
    }
}
