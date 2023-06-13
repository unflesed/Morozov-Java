import java.util.Scanner;

public class Task3 {
    public static final int DIVIDER = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задайте длину массива:");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " целочисленный элемент массива:");
            array[i] = scanner.nextInt();
        }

        System.out.printf("Элементы кратные %d:\n", DIVIDER);

        for (int a : array) {
            if (a % DIVIDER == 0) {
                System.out.println(a);
            }
        }
    }
}
