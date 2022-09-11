import java.util.Scanner;

public class TwoDishNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (b<n){
                System.out.println("NO");
            } else if ((a+c)<n){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
