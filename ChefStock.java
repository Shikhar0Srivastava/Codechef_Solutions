import java.util.Scanner;

public class ChefStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int s = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double percent = (double) c*s/100;
            double price = s + percent;
            if (price >= a && price <= b) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}