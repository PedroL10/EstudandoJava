package app;

import java.util.Arrays;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
    	long startTime = System.currentTimeMillis();
    	
    	
        int[] array = {34, 12, 56, 78, 29, 43, 9, 65, 87, 99, 500, 338,999}; // Exemplo de um array desordenado
        bogoSort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
        
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Tempo de execução: " + elapsedTime + " milissegundos");
        
    }

    public static void bogoSort(int[] array) {
        Random random = new Random();
        while (!isSorted(array)) {
            shuffle(array, random);
        }
    }

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffle(int[] array, Random random) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        
       
    }
 
}
