import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  Number1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = new int[]{1, 1, 0, 0, 1, 1, 0, 0};
        for (int i=0;i<8;i++ ) {
           if (arr[i]==1) {
               arr[i]=0;
           } else {
               arr[i]=1;
           }
           System.out.println(arr[i]);
        }
    }
}
