import java.util.Scanner;

public class TurnIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            int av = ((u*u) - 2*a*s);
            if (av <= (v*v)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
