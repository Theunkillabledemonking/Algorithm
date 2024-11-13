public class Selection_Sort{
    // 정렬 알고리즘
    public static void main(String[] args) {
        // 다음의 숫자들을 오름차순으로 작성
        int index = 0, temp = 0, min = 0;
        int[] array = {1, 10, 5, 8, 7, 5, 4, 3, 2, 9};
        for (int i = 0; i < 10; i++) {
            min = 9999; // 무작위로 큰 값
            for (int j = i; j < 10; j++) {
                if(min > array[j]) { // min 값보다 array[j]보다 작은 경우
                    min = array[j]; // 최솟값 갱신
                    index = j; // 최솟값의 인덱스를 저장
                }
            }
            temp = array[i]; // 현재 위치의 array[i] 값을 임시로 저장
            array[i] = array[index]; // 최솟값인 arrayh[index]를 array[i] 위치로 배치
            array[index] = temp; // 기존 i번째 값을 최소값이 있던 위치에 배치
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d", array[i]);
        }
    
    }

    public static class selection_practive{
        public static void main(String[] args) {

            int[] array = {1, 5, 8, 9, 4, 3, 2, 10, 7, 6};
            int tmp = 0;
            int index = 0;

            for (int i = 0; i < array.length; i++) {
                int min = 999;
                for (int j = i; j < array.length; j++) {
                    // min 값이 array[j] 보다 작을시 min으로 바꾸기
                    if (min > array[j]) {
                        min = array[j];
                        // 최소값 인덱스를 저장
                        index = j;
                    }
                }
                // 현재 위치 tmp에 저장
                tmp = array[i];
                // 최소 값 인덱스를 배열에 바꿔주기
                array[i] = array[index];
                // 바꾼값에 tmp 저장 된 값 채우기
                array[index] = tmp;
            }

            for (int arrays : array) {
                System.out.println(arrays);
            }
        }

    }
}
// 1 2 3 4 5 6 7 8 9 10
// 10 + 9 + 8 + .. + 1 -> 10 * (10 + 1) /2 = 55번을 비교연산을 해야 한다.
// 수식으로 N * (N + 1) / 2 -> O(N * N) 수행시간을 가지고 있다.
// 데이터의 양이 조금 많아져도 연산 횟수가 많아지므로 효율적이지는 않다.