package myjava;

public class qucikSortAlgorithm {
	public static void quickSort(int[] array, int start, int end) {
		if (start >= end) { // 원소가 1개인 경우
			return;
		}
		
		int key = start; // 첫번째는 키 원소
		int i = start + 1;
		int j = end;
		int temp;
		
		while (i <= j) { // 엇갈릴 때까지 반복
            while (i <= end && array[i] <= array[key]) { // 키 값보다 큰 값 찾기
                i++;
            }
            while (j > start && array[j] >= array[key]) { // 키 값보다 작은 값 찾기
                j--;
            }
            if (i > j) { // 현재 엇갈린 상태면 키 값과 교체
                temp = array[j];
                array[j] = array[key];
                array[key] = temp;
            } else { // 엇갈리지 않았다면 i와 j를 교체
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
		
		quickSort(array, start, j - 1);
		quickSort(array, j + 1, end);
		
	}
	
	public static void main(String[] args) {
		
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int num = array.length;
		
		quickSort(array, 0, num - 1); 
		
		for (int i = 0; i < num; i++) {
			System.out.printf("%d", array[i]);
		}
	}
}
