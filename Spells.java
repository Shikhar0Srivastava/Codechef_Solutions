import java.util.Scanner;

public class Spells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = a+b;
            int y = b+c;
            int z = c+a;
            if (x >= y && x >= z) {
                System.out.println(x);
            } else if (y>=z && y>=x) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        }
    }
}
