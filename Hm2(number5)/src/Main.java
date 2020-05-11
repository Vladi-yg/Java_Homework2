public class Main {

    public static void main(String[] args) {
	  // Number 5 * Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        // Поиск минимума
	   int[] arr = new int[8];
	   for (int i = 0; i < 8; i++) {
	       arr[i] = ((int)(Math.random()*15));
	       System.out.print(arr[i] + " " ) ;
       }
	   int min = 1000;
	   for (int i = 0; i < 8; i++) {
	   	   if (arr[i]<min) {
			   min = arr[i];
		   }
	   }
		System.out.println( "Минимум массива" + min);
	 // Поиск максимума массива
	   int max=0;
	   for (int i =0 ; i < 8; i++) {
	   	  if (arr[i] > max) {
	   	  	max = arr[i];
		  }
	   }
	   System.out.println("Максимум массива" + max);
    }
}
