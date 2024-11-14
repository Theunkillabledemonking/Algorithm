public class bubbleSort {
    public static void main(String[] args) {
        int tmp = 0;
        int[] array = {1, 5, 8, 9, 10, 2, 4, 6, 3, 7};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        for (int peachs : array) {
            System.out.println(peachs);
        }
    }
}