import java.util.Scanner;

public class T13_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]= in.nextInt();
        }
        int[] b = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i]= in.nextInt();
        }

        int[] c = new int[10];
        if(a[4]>=b[4]) {
            int x= 0, k=0;
            for (int i = 0; i < a.length; i++) {
                while(b[k]<=a[i]) {
                    c[x]=b[k];
                    x++;
                    k++;
                }
                c[x]=a[i];
                x++;
            }
        }
        else{
            int x= 0, k=0;
            for (int i = 0; i < b.length; i++) {

                if(k<=4) {
                    while(a[k]<=b[i]) {
                        c[x]=a[k];
                        x++;
                        k++;
                    }
                }
                c[x]=b[i];
                x++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }

    }

}
