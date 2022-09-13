import java.util.Scanner;

public class TAndJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int k = sc.nextInt();
            int steps = Math.abs(a-c) + Math.abs(b-d);
            if (k < steps) {
                System.out.println("no");
            } else if ((k - steps) % 2 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
