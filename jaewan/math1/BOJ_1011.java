package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1011 {
    public static void main(String[] args) throws IOException {
        //시간초과
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int dis = b - a;
            int x = 0;
            int count = 1;
            while(x < dis){
                count++;
                x+=(count/2);
            }
            System.out.println(count-1);
        }
    }
}
