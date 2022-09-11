import java.util.Scanner;

public class WeightBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int wi = sc.nextInt();
            int wf = sc.nextInt();
            int xs = sc.nextInt();
            int xb = sc.nextInt();
            int m = sc.nextInt();
            int minWt = wi + (m*xs);
            int maxWt = wi + (m*xb);
            if ((wf>=minWt) && (wf<=maxWt)){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
