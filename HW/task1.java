package HW;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    /*
     * Реализуйте метод, принимающий в качестве аргументов два целочисленных
     * массива,
     * и возвращающий новый массив, каждый элемент которого равен разности элементов
     * двух входящих массивов в той же ячейке. Если длины массивов не равны,
     * необходимо как-то оповестить пользователя.
     * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
     * и возвращающий новый массив, каждый элемент которого равен частному элементов 
     * двух входящих массивов в той же ячейке. Если длины массивов не равны, 
     * необходимо как-то оповестить пользователя. Важно: При выполнении метода 
     * единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
     */
    static void task1() {
        try {
            int[] result = differenceArrays(new int[] { 6, 12, -34, 87, -43 },
                    new int[] { 1, 0, 34, 98, -23, -32 });
            System.out.println("arrays difference:");
            for (int value : result) {
                System.out.printf("%d\t", value);
            }
            System.out.println();
            System.out.println("arrays division:");
            for (int value : result){
                System.out.printf("%d\t", value);
            }
            System.out.println();

            System.out.println();
        } catch (ArraySizeExeption e) {
            System.out.println(e.getMessage());
            System.out.printf("Длина первого массива = %d\nДлина второго массива = %d\n", e.getLength1(),
                    e.getLength2());
        }
    }

    static int[] divideArrays(int[] array1, int[] array2){
        int[] resultArray = new int[array1.length];
        if (array1.length != array2.length) {
            throw new ArraySizeExeption("Размеры массивов должны быть равны", array1.length, array2.length);
        }
        if (array1 == null || array2 == null) {
            throw new NullPointerException("Оба массива должны существовать");
        }
        for (int i = 0; i < array1.length; i++) {

            resultArray[i] = array1[i] / array2[i];
        }
        return resultArray;
    }

    static int[] differenceArrays(int[] array1, int[] array2) {
        int[] resultArray = new int[array1.length];
        if (array1.length != array2.length) {
            throw new ArraySizeExeption("Размеры массивов должны быть равны", array1.length, array2.length);
        }
        if (array1 == null || array2 == null) {
            throw new NullPointerException("Оба массива должны существовать");
        }
        for (int i = 0; i < array1.length; i++) {

            resultArray[i] = array1[i] - array2[i];
        }
        return resultArray;
    }

}

class ArraySizeExeption extends RuntimeException {
    private int length1;
    private int length2;

    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return length2;
    }

    public ArraySizeExeption(String message, int length1, int length2) {
        super(message);
        this.length1 = length1;
        this.length2 = length2;
    }
}