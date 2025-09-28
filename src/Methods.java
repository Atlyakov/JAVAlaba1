public class Methods {
    // Задание 1: Дробная часть числа
    public double fraction(double number) {
        return number - (int) number;
    }

    // Задание 2: Преобразование символа в число
    public int charToNum(char inputChar) {
        if (inputChar < '0' || inputChar > '9') {
            System.out.println("Ошибка: введен не цифровой символ!");
            return -1;
        }
        return inputChar - '0';
    }

    // Задание 3: Проверка на двузначное число
    public boolean is2Digits(int number) {
        return number >= 10 && number <= 99;
    }

    // Задание 4: Проверка числа в диапазоне
    public boolean isInRange(int a, int b, int num) {
        if (a >= b) {
            System.out.println("Неправильно введены границы диапазона!");
            return false;
        }
        return num >= a && num <= b;
    }

    // Задание 5: Проверка на равенство трех чисел
    public boolean isEqua(int a, int b, int c) {
        return a == b && b == c;
    }

    // Задание 6: Модуль числа
    public int abs(int x) {
        return x < 0 ? -x : x;
    }

    // Задание 7: Деление на 3 или 5, но не на оба
    public boolean is35(int x) {
        boolean div3 = x % 3 == 0;
        boolean div5 = x % 5 == 0;
        return (div3 || div5) && !(div3 && div5);
    }

    // Задание 8: Максимум из трех чисел
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    // Задание 9: Сумма двух чисел с особым условием
    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    // Задание 10: День недели
    public String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    // Задание 11: Вывод чисел от 0 до x
    public String listNums(int x) {
        if (x <= 0) {
            System.out.println("Ошибка, число не должно быть отрицательным");
            return "-1";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i);
            if (i < x) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Задание 12: Вывод четных чисел от 0 до x
    public String chet(int x) {
        if (x <= 0) {
            System.out.println("Ошибка, число не должно быть отрицательным");
            return "-1";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i);
            if (i + 2 <= x) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Задание 13: Количество цифр в числе
    public int numLen(long x) {
        if (x <= 0) {
            System.out.println("Ошибка, число должно быть положительным");
            return -1;
        }
        int length = 0;
        while (x > 0) {
            x /= 10;
            length++;
        }
        return length;
    }

    // Задание 14: Квадрат из звездочек
    public void square(int x) {
        if (x <= 0) {
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

    // Задание 15: Правый треугольник из звездочек
    public void rightTriangle(int x) {
        if (x <= 0) {
            System.out.println("Ошибка, число должно быть положительным");
            return;
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Задание 16: Поиск первого вхождения в массиве
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Задание 17: Максимальное значение по модулю в массиве
    public int maxAbs(int[] arr) {
        int maxAbsValue = Math.abs(arr[0]);
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentAbs = Math.abs(arr[i]);
            if (currentAbs > maxAbsValue) {
                maxAbsValue = currentAbs;
                result = arr[i];
            }
        }
        return result;
    }

    // Задание 18: Вставка одного массива в другой
    public int[] add(int[] arr, int[] arr2, int pos) {
        int[] result = new int[arr.length + arr2.length];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[pos + i] = arr2[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[arr2.length + i] = arr[i];
        }

        return result;
    }

    // Задание 19: Реверс массива
    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // Задание 20: Поиск всех вхождений в массиве
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
}
