import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Ваше число не больше 7.");
        }

        System.out.println("Введите Ваше имя:");
        String name = sc.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        int size = 0;
        boolean correctSize = false;
        while (!correctSize) {
            System.out.println("Введите размер массива:");
            size = sc.nextInt();
            if (size <= 0) {
                System.out.println("Неверный размер массива! Попробуйте снова.");
            } else {
                correctSize = true;
            }
        }
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Элементы массива кратные 3:");
        boolean foundFlag = false;
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.printf("%d ", num);
                foundFlag = true;
            }
        }
        if (!foundFlag) {
            System.out.println("Нет элементов кратных 3");
        }
    }
}