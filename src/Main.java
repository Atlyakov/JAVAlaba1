import java.util.Scanner;

public class Main {
    //Задания из первой главы (методы)(1-5)
    public static double fraction(double x) {//Задание 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x: ");
        double number = scanner.nextDouble();
        double result = number - (int) number;//от числа с дробной частью вычитаем целую часть числа
        System.out.println("Дробная часть х: " + result);
        return result;    }

    public static int charToNum(){//Задание 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ цифры (0-9)h: ");
        char inputChar = scanner.next().charAt(0);

        // Проверка на правильный ввод
        if (inputChar < '0' || inputChar > '9') {
            System.out.println("Ошибка: введен не цифровой символ!");
            return -1;
        }

        int result = inputChar - '0';//Вычитаем из кода введенного символа код символа'0'
        System.out.println("Символ '" + inputChar + "' преобразован в число: " + result);

        return result;
    }

    public static boolean is2Digits() {//Задание 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int number = scanner.nextInt();
        boolean result = number >= 10 && number <= 99;
        System.out.println("Результат: " + result);
        return result;
    }

    public static boolean isInRange() {//Задание 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нижнюю границу диапазона: ");
        int a = scanner.nextInt();
        System.out.println("Введите верхнюю границу диапозона: ");
        int b = scanner.nextInt();
        System.out.println("Введите число в диапазоне: ");
        int num = scanner.nextInt();
        if (a < b){
            boolean result = num >= a && num <= b;
            System.out.println("Результат: " + result);
            return result;}
        else {
            System.out.println("Неправильно введены границы диапазона!");
            return false;}
    }

    public static boolean isEqua(){//Задание 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Равные числа. Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();
        boolean result = a == b && b == c;
        System.out.println("Результат: " + result);
        return result;
    }

    //Задания из второй главы (условия)(6-10)
    public static int abs(){//Задание 6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(вывод положительного): ");
        int x = scanner.nextInt();
        if (x < 0){
            int result = -x;
            System.out.println("Модуль числа: " + result);
        }
        else{
            int result = x;
            System.out.println("Модуль числа: " + result);
        }
        return 1;
    }

    public static boolean is35(){//Задание 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(деление нацело на 3 и 5): ");
        int x = scanner.nextInt();
        boolean div3 = x % 3 == 0;
        boolean div5 = x % 5 == 0;
        boolean result = (div3 || div5) && !(div3 && div5);
        System.out.println("Результ: " + result);
        return result;
    }

    public static int max3(){//Задание 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число из  трех(поиск максимального): ");
        int x = scanner.nextInt();
        System.out.println("Введите торое число: ");
        int y = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int z = scanner.nextInt();
        int max = x;
        if (y > max) max = y;
        if (z > max) max =z;
        System.out.println("Максимальное число: " + max);
        return max;
    }

    public static int sum2(){//Задание 9
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(сумма двух чисел((10>=x<=20)==20): ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int y = scanner.nextInt();
        int sum = x + y;
        if (sum >= 10 && sum <= 19) sum = 20;
        System.out.println("Сумма чисел: " + sum);
        return sum;
    }

    public static String day() {//Задание 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7(дни недели): ");
        int x = scanner.nextInt();
        String result;
        switch (x) {
            case 1: result = "понедельник";
                System.out.println("Результат: " + result);
                break;
            case 2: result = "вторник";
                System.out.println("Результат: " + result);
                break;
            case 3: result = "среда";
                System.out.println("Результат: " + result);
                break;
            case 4: result = "четверг";
                System.out.println("Результат: " + result);
                break;
            case 5: result = "пятница";
                System.out.println("Результат: " + result);
                break;
            case 6: result = "суббота";
                System.out.println("Результат: " + result);
                break;
            case 7: result = "воскресенье";
                System.out.println("Результат: " + result);
                break;
            default: result = "это не день недели";
        }
        return result;
    }

    //Задания из третьей главы(циклы)(11-15)
    public static String listNums() {//Задание 11
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(вывод от 0 до х): ");
        int x = scanner.nextInt();
        if (x <= 0){
            System.out.println("Ошибка, число не должно быть отрицательным: ");
            return "-1";
        }
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i;
            if (i < x) {
                result += " ";
            }
        }
        System.out.println("Результат: " + result);
        return result;
    }

    public static String chet(){//Задание 12
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(вывод от 0 до х только четных): ");
        int x = scanner.nextInt();
        if (x <= 0){
            System.out.println("Ошибка, число не должно быть отрицательным: ");
            return "-1";
        }
        String result = "";
        for (int i = 0; i <= x; i+=2) {
            result += i;
            if (i + 2 <= x) {
                result += " ";
            }
        }
        System.out.println("Результат: " + result);
        return result;
    }

    public static int numLen() {//Задание 13
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(вывод количества знаков в числе): ");
        long x = scanner.nextInt();
        if (x <= 0){
            System.out.println("Ошибка, число должно быть положительным");
            return -1;
        }
        int length = 0;
        while (x > 0) {
            x /= 10;
            length++;
        }
        System.out.println("Результат: " + length);

        return length;
    }

    public static void square() {//Задание 14
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(построение квадрата x*x): ");
        int x = scanner.nextInt();
        if (x <= 0){
            System.out.println("Ошибка, число должно быть положительным");
            return;
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void rightTriangle() {//Задание 15
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(построение правого треугольника): ");
        int x = scanner.nextInt();
        if (x <= 0){
            System.out.println("Ошибка, число должно быть положительным");
            return;
        }
        for (int i = 1; i <= x; i++) {
            // Печатаем пробелы
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            // Печатаем звездочки
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Задания из четвертой главы (массивы)(16-20)
    public static int findFirst() {
        Scanner scanner = new Scanner(System.in);
        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        if (size <= 0){
            System.out.println("Ощибка, число должно быть положительным");
            return -1;
        }
        // Создание массива
        int[] arr = new int[size];
        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // Ввод искомого числа
        System.out.print("Введите число для поиска: ");
        int x = scanner.nextInt();
        // Поиск первого вхождения
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Индекс первого вхождения: " + i);
                return i;
            }
        }
        System.out.println("Число не найдено в массиве");
        return -1;
    }

    public static int maxAbs(){//Задание 17
        Scanner scanner = new Scanner(System.in);
        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        if (size <= 0){
            System.out.println("Ощибка, число должно быть положительным");
            return -1;
        }
        // Создание массива
        int[] arr = new int[size];
        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int maxAbsValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // Вычисляем модуль текущего элемента
            int currentAbs = arr[i];
            if (currentAbs < 0) {
                currentAbs = -currentAbs;
            }
            // Вычисляем модуль текущего максимума
            int maxAbs = maxAbsValue;
            if (maxAbs < 0) {
                maxAbs = -maxAbs;
            }
            // Сравниваем модули
            if (currentAbs > maxAbs) {
                maxAbsValue = arr[i];
            }
        }
        System.out.println("Максимальное значение по модулю: " + maxAbsValue);
        return maxAbsValue;
    }

    public static int[] add(){//Задание 18
        Scanner scanner = new Scanner(System.in);
        // Ввод размера массива
        System.out.print("Введите размер первого массива: ");
        int size = scanner.nextInt();
        if (size <= 0){
            System.out.println("Ощибка, число должно быть положительным");
            return new int[]{-1};
        }
        // Создание двух начальных массивов
        int[] arr = new int[size];
        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Введите размер второго массива: ");
        int size2 = scanner.nextInt();
        if (size2 <= 0){
            System.out.println("Ощибка, число должно быть положительным");
            return new int[]{-1};
        }
        int[] arr2 = new int[size2];
        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }
        // Ввод места вставки
        System.out.println("Введите индекс с которого второй массив вставят в первый");
        int pos = scanner.nextInt();
        int[] result = new int[arr.length + arr2.length];
        // Копируем элементы до позиции вставки
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        // Вставляем элементы из массива arr2
        for (int i = 0; i < arr2.length; i++) {
            result[pos + i] = arr2[i];
        }
        // Копируем оставшиеся элементы из arr
        for (int i = pos; i < arr.length; i++) {
            result[arr2.length + i] = arr[i];
        }
        // Вывод результата
        System.out.print("Результат: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }

    public static int[] reverseBack(){//Задание 19
        Scanner scanner = new Scanner(System.in);
        // Ввод размера массива
        System.out.print("Введите размер массива (вывод реверс): ");
        int size = scanner.nextInt();
        if (size <= 0){
            System.out.println("Ощибка, число должно быть положительным");
            return new int[]{-1};
        }
        // Создание массива
        int[] arr = new int[size];
        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // Создаем реверсивный массив такого же размера
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        // Вывод результата
        System.out.print("Результат: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;

    }

    public static int[] findAll(){//
        Scanner scanner = new Scanner(System.in);
        // Ввод размера массива
        System.out.print("Введите размер массива ( поиск индексов вхождений): ");
        int size = scanner.nextInt();
        if (size <= 0){
            System.out.println("Ощибка, число должно быть положительным");
            return new int[]{-1};
        }
        // Создание массива
        int[] arr = new int[size];
        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // Ввод искомого числа
        System.out.print("Введите искомое число: ");
        int x = scanner.nextInt();
        // Сначала посчитаем количество вхождений
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        // Создаем массив нужного размера
        int[] result = new int[count];
        // Заполняем массив индексами
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        // Вывод результата
        System.out.print("Индексы вхождений искомого числа: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);

        System.out.print("Выберите задание (Методы(1-5), Условия(6-10), Циклы(11-15), Массивы(16-20)):");


        int choice = mainScanner.nextInt();

        switch(choice) {
            case 1:
                fraction(0);
                break;
            case 2:
                charToNum();
                break;
            case 3:
                is2Digits();
                break;
            case 4:
                isInRange();
                break;
            case 5:
                isEqua();
                break;
            case 6:
                abs();
                break;
            case 7:
                is35();
                break;
            case 8:
                max3();
                break;
            case 9:
                sum2();
                break;
            case 10:
                day();
                break;
            case 11:
                listNums();
                break;
            case 12:
                chet();
                break;
            case 13:
                numLen();
                break;
            case 14:
                square();
                break;
            case 15:
                rightTriangle();
                break;
            case 16:
                findFirst();
                break;
            case 17:
                maxAbs();
                break;
            case 18:
                add();
                break;
            case 19:
                reverseBack();
                break;
            case 20:
                findAll();
                break;
            default:
                System.out.println("Ошибка: выберите задание с 1 по 20!");
        }

    }

}