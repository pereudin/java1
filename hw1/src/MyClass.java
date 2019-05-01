import java.util.Scanner;

public class MyClass {

    //решение пункта 1.
    public static void main(String[] args){

        //решение пункта 2.
        byte a = 127;
        short b = 32767;
        char c = 'A';
        int d = 1;
        long e = 2L;
        float f = 3.0f;
        double g = 4.0;
        boolean h = true;

        //код для проверки написанных методов
        Scanner number = new Scanner(System.in);

        System.out.println("Для вычисления значения выражения A * (B + (C / D)) введите число А:");
        float A = number.nextInt();
        System.out.println("Теперь введите число B:");
        float B = number.nextInt();
        System.out.println("Введите число C:");
        float C = number.nextInt();
        System.out.println("И, наконец, введите число D:");
        float D = number.nextInt();
        System.out.println("A * (B + (C / D)) = " + calculation(A, B, C, D));

        System.out.println("Введите число для проверки:");
        int pos = number.nextInt();
        isPositive(pos);

        System.out.println("Укажите Ваше имя:");
        String name = number.next();
        hello(name);

        System.out.println("Напишите год (в формате ГГГГ):");
        int year = number.nextInt();
        whatYear(year);

        number.close();
    }

    //решение пункта 3.
    public static float calculation(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    //решение пункта 4.
    public static boolean comparison(int a, int b){
        if(a + b > 10 && a + b <= 20) return true;
        else return false;
    }

    //решение пункта 5.
    public static void isPositive(int x){
        if(x >= 0) System.out.println("Это положительное число");
        else System.out.println("Это отрицательное число");
    }

    //решение пункта 6.
    public static boolean isNegative(int y){
        if(y < 0) return true;
        else return false;
    }

    //решение пункта 7.
    public static void hello(String str){
        System.out.println("Привет, " + str + "!");
    }

    //решение пункта 8.
    public static void whatYear(int year){
        if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
            System.out.println(year + " является високосным годом");
        else System.out.println(year + " не является високосным годом");
    }
}

/*
    Ответ на пункт 9: Это один и тот же метод.
 */
