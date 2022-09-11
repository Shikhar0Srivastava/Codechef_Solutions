import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int ans = 0;
            for (int j=0;j<n;j++){
                int s = sc.nextInt();
                int r = sc.nextInt();
                if ((s<=x) && (r>ans)){
                    ans = r;
                }
            }
            System.out.println(ans);
        }
    }
}
