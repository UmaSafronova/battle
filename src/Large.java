import java.util.Scanner;
public class Large{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int z1 = in.nextInt();
        int z2 = in.nextInt();
        int p = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n / 2 + 1];
        System.out.print("Мой массив: ");
        for (int i = 0; i <= n - 1; i++){
            a[i] = (int) Math.round(Math.random() * 40) - 20;
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Кол-во и сумма наименьших чисел: ");
        int t = 21;
        for (int i = 0; i <= n - 1; i++){
            if (a[i] < t){
                t = a[i];
            }
        }
        int s = 0;
        int k = 0;
        for (int i = 0; i <= n - 1; i++){
            if (a[i] == t) {
                s += a[i];
                k += 1;
            }
        }
        System.out.print(k + " " + s);
        System.out.println("");
        System.out.print("Массив Б: ");
        for (int i = 0; i <= (n - 1) / 2 - 1; i += 1){
            b[i] = a[i * 2];
            System.out.print(b[i] + " ");
        }
        if (n % 2 != 0){
            System.out.print(a[n - 1]);
        }
        else{
            System.out.print(a[n - 2]);
        }
        System.out.println("");
        System.out.print("Массив А, с некоторыми заменённым числами: ");
        for (int i = 0; i <= n - 1; i++){
            if (a[i] % p == 0 && a[i] % q == 0){
                a[i] = z1;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Отсортированный массив: ");
        t = 0;
        for (int i = 1; i <= n - 1; i++){
            t = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > t){
                t = a[j + 1];
                a[j + 1] = a[j];
                a[j] = t;
                j--;
            }
        }
        for (int i = 0; i <= n - 1; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Массив с удалёнными: ");
        int x = n;
        for (int i = 0; i <= n - 1; i++){
            if (a[i] > 0){
                x--;
            }
        }
        for (int i = 0; i <= x - 1; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Массив со вставленным числом: ");
        int r = x - 1;
        int l = 0;
        while (r - l > 1){
            int m = (r + l) / 2;
            if (z2 > a[m]){
                l = m;
            }
            else{
                r = m;
            }
        }
        if (z2 == a[r] || z2 == a[l]){
            for (int i = 0; i <= x - 1; i++){
                System.out.print(a[i] + " ");
            }
        }
        else{
            for (int i = 0; i <= l; i++){
                System.out.print(a[i] + " ");
            }
            System.out.print(z2 + " ");
            for (int i = r; i <= x - 1; i++){
                System.out.print(a[i] + " ");
            }
            int y = r;
            for (int i = x - 1; i > y; i--){
                a[i] = a[i - 1];
            }
            a[r] = z2;
        }
    }
}
