import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Ошибка! Ваше число меньше или равно 7.");
        }

        System.out.println("Введите Ваше имя:");
        String name = sc.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.printf("%d ", num);
            }
        }
    }
}