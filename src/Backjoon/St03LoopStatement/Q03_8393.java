package Backjoon.St03LoopStatement;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q03_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= N; i++) {
           result += i;
        }
        System.out.println(result);
        //int result = N * (N + 1) / 2; 1+N의 공식
    }
}
