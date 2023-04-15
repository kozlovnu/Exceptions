package Seminars;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Seminar1 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

    }

    static int task1(int[] arr, int min) {
        if (arr.length < min) {
            return -1;
        }
        return arr.length;
    }

    static void task2() {

        System.out.println("укажите значение для поиска: ");
        if (scanner.hasNextInt()) {
            int searchNumber = scanner.nextInt();
            int[] array = new int[random.nextInt(5) + 1];
            if (random.nextInt(3) == 0) {
                array = null;
            }
            if (array != null) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(10);
                    System.out.printf("%d\t", array[i]);
                }
                System.out.println();
            }
            int codeResult = processArray(array, searchNumber);
            switch (codeResult) {
                case -1 -> System.out.println("длина массива менее 3 символов");
                case -2 -> System.out.println("элемент не найден");
                case -3 -> System.out.println("массив некорректно инициализирован");

                default -> {
                    System.out.println("массив успешно обработан");
                    System.out.printf("элемент найден по индексу");
                }

            }

        } else {
            System.out.println("число для поиска выбрано некорректно\nПовторите повытку ввода.");
            scanner.nextLine();
        }
    }

    static int processArray(int[] array, int searchArray) {
        if (array == null) {
            return -3; // массив некорректно инициализирован
        } else if (array.length < 3) {
            return -1; // длина массива менее трех
        }
        Arrays.sort(array);
        int searchResult = Arrays.binarySearch(array, searchArray);
        if (searchArray < 0) {
            return -2; // элемент не найден
        }
        return searchResult;

    }

    static void multiply(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        if (arr1 == null || arr2 == null){
            throw new NullPointerException("Both arrays must exist");
        }
        if (arr1.length != arr2.length) {
            throw new CustomArraySizeExeption("Amoun of arrays elements must be equal", arr1.length, arr2.length);
        } else {
            for (int i = 0; i < arr1.length; i++){
                result[i] = arr1[i] + arr2[i];
            }
        }

    }
}

class CustomArraySizeExeption extends RuntimeException {

    private int length1;
    private int length2;

    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return length2;
    }

    public CustomArraySizeExeption(String message, int length1, int length2) {
        super(message);
        this.length1 = length1;
        this.length2 = length2;
    }
    


}
