package baekjoon2;

import java.util.Scanner;

public class if1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();
        if(A>B){
            System.out.println(">");
        } else if(A<B){
            System.out.println("<");
        } else if(A==B){
            System.out.println("==");
        }
    }
}
