package javastudy.beakjoon.array;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i= 0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[0]+" "+array[N-1]);
    }
}
