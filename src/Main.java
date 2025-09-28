import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();

        System.out.print("Выберите задание (1-20): ");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                // Задание 1: Дробная часть числа
                System.out.println("Введите x: ");
                double number1 = scanner.nextDouble();
                double result1 = methods.fraction(number1);
                System.out.println("Дробная часть х: " + result1);
                break;

            case 2:
                // Задание 2: Преобразование символа в число
                System.out.print("Введите символ цифры (0-9): ");
                char inputChar = scanner.next().charAt(0);
                int result2 = methods.charToNum(inputChar);
                if (result2 != -1) {
                    System.out.println("Символ '" + inputChar + "' преобразован в число: " + result2);
                }
                break;

            case 3:
                // Задание 3: Проверка на двузначное число
                System.out.println("Введите двузначное число: ");
                int number3 = scanner.nextInt();
                boolean result3 = methods.is2Digits(number3);
                System.out.println("Результат: " + result3);
                break;

            case 4:
                // Задание 4: Проверка числа в диапазоне
                System.out.println("Введите нижнюю границу диапазона: ");
                int a = scanner.nextInt();
                System.out.println("Введите верхнюю границу диапазона: ");
                int b = scanner.nextInt();
                System.out.println("Введите число в диапазоне: ");
                int num = scanner.nextInt();
                boolean result4 = methods.isInRange(a, b, num);
                System.out.println("Результат: " + result4);
                break;

            case 5:
                // Задание 5: Проверка на равенство трех чисел
                System.out.println("Равные числа. Введите первое число: ");
                int a5 = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b5 = scanner.nextInt();
                System.out.println("Введите третье число: ");
                int c5 = scanner.nextInt();
                boolean result5 = methods.isEqua(a5, b5, c5);
                System.out.println("Результат: " + result5);
                break;

            case 6:
                // Задание 6: Модуль числа
                System.out.println("Введите число(вывод положительного): ");
                int x6 = scanner.nextInt();
                int result6 = methods.abs(x6);
                System.out.println("Модуль числа: " + result6);
                break;

            case 7:
                // Задание 7: Деление на 3 или 5, но не на оба
                System.out.println("Введите число(деление нацело на 3 и 5): ");
                int x7 = scanner.nextInt();
                boolean result7 = methods.is35(x7);
                System.out.println("Результат: " + result7);
                break;

            case 8:
                // Задание 8: Максимум из трех чисел
                System.out.println("Введите первое число из трех(поиск максимального): ");
                int x8 = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int y8 = scanner.nextInt();
                System.out.println("Введите третье число: ");
                int z8 = scanner.nextInt();
                int result8 = methods.max3(x8, y8, z8);
                System.out.println("Максимальное число: " + result8);
                break;

            case 9:
                // Задание 9: Сумма двух чисел с особым условием
                System.out.println("Введите число(сумма двух чисел((10>=x<=20)==20): ");
                int x9 = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int y9 = scanner.nextInt();
                int result9 = methods.sum2(x9, y9);
                System.out.println("Сумма чисел: " + result9);
                break;

            case 10:
                // Задание 10: День недели
                System.out.println("Введите число от 1 до 7(дни недели): ");
                int x10 = scanner.nextInt();
                String result10 = methods.day(x10);
                System.out.println("Результат: " + result10);
                break;

            case 11:
                // Задание 11: Вывод чисел от 0 до x
                System.out.println("Введите число(вывод от 0 до х): ");
                int x11 = scanner.nextInt();
                String result11 =methods.listNums(x11);
                if (!result11.equals("-1")) {
                    System.out.println("Результат: " + result11);
                }
                break;

            case 12:
                // Задание 12: Вывод четных чисел от 0 до x
                System.out.println("Введите число(вывод от 0 до х только четных): ");
                int x12 = scanner.nextInt();
                String result12 = methods.chet(x12);
                if (!result12.equals("-1")) {
                    System.out.println("Результат: " + result12);
                }
                break;

            case 13:
                // Задание 13: Количество цифр в числе
                System.out.println("Введите число(вывод количества знаков в числе): ");
                long x13 = scanner.nextLong();
                int result13 = methods.numLen(x13);
                if (result13 != -1) {
                    System.out.println("Результат: " + result13);
                }
                break;

            case 14:
                // Задание 14: Квадрат из звездочек
                System.out.println("Введите число(построение квадрата x*x): ");
                int x14 = scanner.nextInt();
                methods.square(x14);
                break;

            case 15:
                // Задание 15: Правый треугольник из звездочек
                System.out.println("Введите число(построение правого треугольника): ");
                int x15 = scanner.nextInt();
                methods.rightTriangle(x15);
                break;

            case 16:
                // Задание 16: Поиск первого вхождения в массиве
                System.out.print("Введите размер массива: ");
                int size16 = scanner.nextInt();
                if (size16 <= 0) {
                    System.out.println("Ошибка, число должно быть положительным");
                    break;
                }
                int[] arr16 = new int[size16];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size16; i++) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    arr16[i] = scanner.nextInt();
                }
                System.out.print("Введите число для поиска: ");
                int x16 = scanner.nextInt();
                int result16 = methods.findFirst(arr16, x16);
                if (result16 != -1) {
                    System.out.println("Индекс первого вхождения: " + result16);
                } else {
                    System.out.println("Число не найдено в массиве");
                }
                break;

            case 17:
                // Задание 17: Максимальное значение по модулю в массиве
                System.out.print("Введите размер массива: ");
                int size17 = scanner.nextInt();
                if (size17 <= 0) {
                    System.out.println("Ошибка, число должно быть положительным");
                    break;
                }
                int[] arr17 = new int[size17];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size17; i++) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    arr17[i] = scanner.nextInt();
                }
                int result17 = methods.maxAbs(arr17);
                System.out.println("Максимальное значение по модулю: " + result17);
                break;

            case 18:
                // Задание 18: Вставка одного массива в другой
                System.out.print("Введите размер первого массива: ");
                int size18_1 = scanner.nextInt();
                if (size18_1 <= 0) {
                    System.out.println("Ошибка, число должно быть положительным");
                    break;
                }
                int[] arr18_1 = new int[size18_1];
                System.out.println("Введите элементы первого массива:");
                for (int i = 0; i < size18_1; i++) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    arr18_1[i] = scanner.nextInt();
                }

                System.out.print("Введите размер второго массива: ");
                int size18_2 = scanner.nextInt();
                if (size18_2 <= 0) {
                    System.out.println("Ошибка, число должно быть положительным");
                    break;
                }
                int[] arr18_2 = new int[size18_2];
                System.out.println("Введите элементы второго массива:");
                for (int i = 0; i < size18_2; i++) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    arr18_2[i] = scanner.nextInt();
                }

                System.out.println("Введите индекс с которого второй массив вставят в первый");
                int pos18 = scanner.nextInt();
                int[] result18 = methods.add(arr18_1, arr18_2, pos18);
                System.out.print("Результат: ");
                for (int i = 0; i < result18.length; i++) {
                    System.out.print(result18[i] + " ");
                }
                System.out.println();
                break;

            case 19:
                // Задание 19: Реверс массива
                System.out.print("Введите размер массива (вывод реверс): ");
                int size19 = scanner.nextInt();
                if (size19 <= 0) {
                    System.out.println("Ошибка, число должно быть положительным");
                    break;
                }
                int[] arr19 = new int[size19];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size19; i++) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    arr19[i] = scanner.nextInt();
                }
                int[] result19 = methods.reverseBack(arr19);
                System.out.print("Результат: ");
                for (int i = 0; i < result19.length; i++) {
                    System.out.print(result19[i] + " ");
                }
                System.out.println();
                break;

            case 20:
                // Задание 20: Поиск всех вхождений в массиве
                System.out.print("Введите размер массива (поиск индексов вхождений): ");
                int size20 = scanner.nextInt();
                if (size20 <= 0) {
                    System.out.println("Ошибка, число должно быть положительным");
                    break;
                }
                int[] arr20 = new int[size20];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size20; i++) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    arr20[i] = scanner.nextInt();
                }
                System.out.print("Введите искомое число: ");
                int x20 = scanner.nextInt();
                int[] result20 = methods.findAll(arr20, x20);
                System.out.print("Индексы вхождений искомого числа: ");
                for (int i = 0; i < result20.length; i++) {
                    System.out.print(result20[i] + " ");
                }
                System.out.println();
                break;

            default:
                System.out.println("Ошибка: выберите задание с 1 по 20!");
        }

        scanner.close();
    }
}