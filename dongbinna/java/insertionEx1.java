package myjava;
import java.util.ArrayList;
import java.util.Collections;

public class insertionEx1 {
	// 삽입 정렬로 순위 계산하기
	public static int[] calculateRanks(int[] scores) {
		int[] ranks = new int[scores.length];
		for (int i = 0; i < scores.length; i++) {
			ranks[i] = 1; // 기본 순위를 1로 설정
			for (int j = 0; j < scores.length; j++) {
				if (scores[j] > scores[i]) {
					ranks[i]++;
				}
			}
		}
		return ranks;
	}
	
	
	
	public static void main(String[] args) {
		// 삽입 정렬 예제
		
		// 실시간 삽입 정렬
		ArrayList<Integer> list = new ArrayList<>();
		int[] input = {5, 2, 8, 1, 4};
		
		for (int num : input) {
			list.add(num);
			Collections.sort(list);
			System.out.println(list);
		}
	}
}
