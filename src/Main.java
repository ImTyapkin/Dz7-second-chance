import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 7;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt(); // Ввод размера массива
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Ввод элементов массива
        }
        System.out.println("Введённые элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]); // Вывод элементов массива
        }

        for (int i = 0; i < size; i++) {
            while (array[i] == x || array[i] == y || array[i] == z) {
                System.out.println(array[i] + " - данное значение имеется в константах");
                break;
            }
        }
    }
}