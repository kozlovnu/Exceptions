package HW;

import java.util.Scanner;

public class Task2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        task4();
    }

    /*
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа
     * (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить
     * к падению
     * приложения, вместо этого, необходимо повторно запросить у пользователя ввод
     * данных.
     */

    static void task1() {
        Float number;
        Boolean flag = true;
        while (flag) {
            System.out.println("Введите дробное число: ");
            try {
                number = Float.parseFloat(scanner.nextLine());
                scanner.close();
                flag = false;
                System.out.println(number);

            } catch (NumberFormatException e) {
                System.out.printf("Введена строка, необходимо ввести число.\n");
            }
        }
    }

    /*
     * Если необходимо, исправьте данный код
     * try {
     * int d = 0;
     * double catchedRes1 = intArray[8] / d;
     * System.out.println("catchedRes1 = " + catchedRes1);
     * } catch (ArithmeticException e) {
     * System.out.println("Catching exception: " + e);
     * }
     */

    static void task2() {
        int[] intArray = new int[] { 1, 4, -34, -23, 23, 65, 7, 21 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }

    /*
     * Дан следующий код, исправьте его там, где требуется
     * public static void main(String[] args) throws Exception {
     * try {
     * int a = 90;
     * int b = 3;
     * System.out.println(a / b);
     * printSum(23, 234);
     * int[] abc = { 1, 2 };
     * abc[3] = 9;
     * } catch (Throwable ex) {
     * System.out.println("Что-то пошло не так...");
     * } catch (NullPointerException ex) {
     * System.out.println("Указатель не может указывать на null!");
     * } catch (IndexOutOfBoundsException ex) {
     * System.out.println("Массив выходит за пределы своего размера!");
     * }
     * }
     * public static void printSum(Integer a, Integer b) throws
     * FileNotFoundException {
     * System.out.println(a + b);
     * }
     * 
     */

    static void task3() {
        try {
            int a = 90;
            int b = 0;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    /*
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит
     * пустую строку. Пользователю должно показаться сообщение, что пустые строки
     * вводить
     * нельзя
     */

    static void task4() {
        inputString();
    }

    static String inputString() throws RuntimeException {
        String input = null;
        while (input == null || input.length() == 0) {

            try {
                System.out.println("Input text:");
                input = scanner.nextLine();
                if (input.equals("")) {
                    throw new RuntimeException("Input empty string is prohibited");
                }
            } catch (RuntimeException e) {

                System.out.println(e.getMessage() + "Incorrect input");
                ;
            }
        }
        return input;

    }

}
