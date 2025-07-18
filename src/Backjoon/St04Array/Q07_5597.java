package Backjoon.St04Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }

    }
}
