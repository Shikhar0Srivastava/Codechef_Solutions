import java.util.Scanner;

public class RichieRich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int count = 0;
            while (a < b) {
                a+=x;
                count++;
            }
            System.out.println(count);
        }
    }
}
