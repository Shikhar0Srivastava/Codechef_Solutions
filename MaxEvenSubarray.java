import java.util.Scanner;

public class MaxEvenSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int sum = n*(n+1)/2;
            int count = n;
            if (sum % 2 != 0) {
                for (int j=0;j<n;j++){
                    sum-=(n-j);
                    count--;
                    if (sum%2==0){
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
