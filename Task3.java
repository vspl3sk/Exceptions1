/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов
в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, 
которое пользователь может увидеть - RuntimeException, т.е. ваше.*/

public class Task3 {

    public static void main(String[] args) {

        int[] arr1 = new int[] { 5, 4, 3, 4, 5 };
        int[] arr2 = new int[] { 4, 0, 2, 1, 3 };
        divisionArray(arr1, arr2);

    }

    public static void divisionArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны.");
        }
        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Деление на ноль запрещено.");
            }
            result[i] = array1[i] / array2[i];
            System.out.print(result[i] + " ");
        }

    }
}
