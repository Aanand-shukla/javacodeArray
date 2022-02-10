import java.util.Scanner;

public class Happyballons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];// [0,1,2,3,4,5]
        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int happyballons = 0;
        for (int i = 1; i <= n; i++) {

            if (arr[i] % 2 == 0 && i % 2 == 0) {
                happyballons++;

            } else if (i % 2 != 0 && arr[i] % 2 != 0) {
                happyballons++;
            }
        }
        System.out.println(happyballons);
        sc.close();
    }
}
