import java.util.Scanner;

public class TwoDishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int count = 0;
            for (int j=0;j<=n;j++){
                if ((s-j)<=n && (s-j)>=0){
                    int ans=Math.abs(s-(2*j));
                    if (ans > count) {
                        count = ans;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
