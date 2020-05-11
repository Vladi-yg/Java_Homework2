import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  Number 3 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr = new int[8];
        for (int i = 0; i<8; i++) {
            arr[i]=i*3;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
