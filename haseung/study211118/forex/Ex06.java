package forex;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();

        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i=0; i<n; i++) {
            if (a[i] < x) {
                System.out.printf("%d ", a[i]);
            }
        }
    }
}
