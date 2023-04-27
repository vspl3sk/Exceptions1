/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 и возвращающий новый массив, каждый элемент которого равен разности элементов 
 двух входящих массивов в той же ячейке.
 Если длины массивов не равны, необходимо как-то оповестить пользователя. */

public class Task2 {

    public static void main(String[] args) {
        int[] arr1 = new int[] { 5, 4, 3, 4, 5 };
        int[] arr2 = new int[] { 4, 2, 0, 1, 3 };
        differenceArray(arr1, arr2);

    }

    public static void differenceArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны.");
        }
        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
            System.out.print(result[i] + " ");
        }

    }
}