import java.util.Arrays;

import static java.lang.Math.sqrt;

class Homework {
    public static void main(String[] args) {
        Task_first();
        Task_second();
    }

    public static void Task_first() {
        System.out.println("-------------------------------------------");
        System.out.print("Task 1\n");
        int[] array;
        array = new int[40];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1001));
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        System.out.printf("Max: %s \n", Arrays.stream(array).max().getAsInt());
        System.out.printf("Min: %s \n", Arrays.stream(array).min().getAsInt());
        System.out.printf("Avr: %s \n", Arrays.stream(array).average().getAsDouble());
        System.out.println("-------------------------------------------");
    }

    public static void Task_second() {
        System.out.print("Task 2\n");
        for (int i = 2; i < 101; i++) {
            if (IsSimple(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n-------------------------------------------");
    }

    private static boolean IsSimple(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}