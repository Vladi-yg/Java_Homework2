public class Main {

    public static void main(String[] args) {
	// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr = new int[] {1, 5, 3 , 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<12; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i]*2;
            }
            System.out.print(arr[i]);
        }
    }
}
