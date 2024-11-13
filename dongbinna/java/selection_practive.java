public class selection_practive{
    public static void main(String[] args) {
        int[] array = {1, 10, 7, 5, 4, 3, 2, 6, 9, 8};
        int temp = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int min = 9999; //최소값설정
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for (int arrays : array) {
            System.out.println(arrays);
        }

    }
}