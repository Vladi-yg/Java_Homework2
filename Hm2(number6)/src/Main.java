import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Number6
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ((int) (Math.random() * 10));
            System.out.print(a[i] + "  ");
        }
        System.out.print(chekbalance(a, n));
    }

    private static boolean chekbalance(int[] a, int n) {
        int leftsum;
        int rightsum;
        for (int i = 0; i < n + 1; i++) {
            leftsum = 0;
            rightsum = 0;

            for (int j = 0; j < i; j++) {
                leftsum = leftsum + a[j];
            }
            for (int j = i; j < n; j++) {
                rightsum = rightsum + a[j];
            }
            if (leftsum == rightsum) return true;
        }
        return false;
    }
}

