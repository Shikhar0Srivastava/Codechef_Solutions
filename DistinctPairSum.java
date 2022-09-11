import java.util.Scanner;

public class DistinctPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int n = r-l;
            System.out.println((2*n)+1);
        }
    }
}
