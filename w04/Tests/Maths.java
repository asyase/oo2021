/*package Tests;

public class Maths {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1));      // 1
        System.out.println(Math.abs(-21.8d));  // 21.8
        System.out.println(Math.abs(4532L));   // 4532
        System.out.println(Math.abs(5.341f));  // 5.341
    }
}
/* static double abs(double a)
static float abs(float a)
static int abs(int a)
static long abs(long a)

------------------------------------------------------------------------------------------------

static double pow(double a, double b)

//Данный метод возводит параметр `a` в степень `b`. Примеры:

public static void main(String[] args) {
        System.out.println(Math.pow(1,2)); // 1.0
        System.out.println(Math.pow(2,2)); // 4.0
        System.out.println(Math.pow(3,2)); // 9.0
        System.out.println(Math.pow(4,2)); // 16.0
        System.out.println(Math.pow(5,2)); // 25.0

        System.out.println(Math.pow(1,3)); // 1.0
        System.out.println(Math.pow(2,3)); // 8.0
        System.out.println(Math.pow(3,3)); // 27.0
        System.out.println(Math.pow(4,3)); // 64.0
        System.out.println(Math.pow(5,3)); // 125.0
    }
---------------------------------------------------------------------------------------------------
    //static double sqrt(double a)
    //static double cbrt(double a)
//Метод sqrt - извлекает квадратный корень (square root), а метод cbrt - кубический (cube root).


public static void main(String[] args) {
        System.out.println(Math.sqrt(4));   // 2.0
        System.out.println(Math.sqrt(9));   // 3.0
        System.out.println(Math.sqrt(16));  // 4.0

        System.out.println(Math.cbrt(8));   // 2.0
        System.out.println(Math.cbrt(27));  // 3.0
        System.out.println(Math.cbrt(125)); // 5.0
    }-------------------------------------------------------------------------------------------------------------------------
    //Для генерации случайных чисел класс Math предоставляет метод random. Данный метод генерирует случайное позитивное вещественное (double) число в промежутке от 0.0 до 1.0. 

//Сигнатура метода имеет следующий вид:

/*public static double random()

Взглянем на примеры:

public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
        System.out.println(Math.random());
    }
}*/


/*
--------------------------------------------------------------------------------------------------
Приведем пример функции которая принимает два аргумента min и max и возвращает случайное целое число, которое лежит в промежутке от min (включительно) до max (включительно):

static int randomInARange(int min, int max) {
    return  (int) (Math.random() * ((max - min) + 1)) + min;
}*/


/*
-------------------------------------------------------------------------------------------------------
Метод round - округляет так, как привычно обывателю. Если дробная часть числа больше либо равна 0.5, то число будет округлено в большую сторону, иначе в меньшую.

Метод floor всегда, независимо от значений дробной части, округляет число в меньшую сторону (в сторону отрицательной бесконечности).  

Метод ceil, напротив, вне зависимости от значений дробной части, округляет числа в большую сторону (в сторону положительной бесконечности). 

Взглянем на примеры:

public static void main(String[] args) {
    System.out.println(Math.round(1.3)); // 1
    System.out.println(Math.round(1.4)); // 1
    System.out.println(Math.round(1.5)); // 2
    System.out.println(Math.round(1.6)); // 2

    System.out.println(Math.floor(1.3)); // 1.0
    System.out.println(Math.floor(1.4)); // 1.0
    System.out.println(Math.floor(1.5)); // 1.0
    System.out.println(Math.floor(1.6)); // 1.0

    System.out.println(Math.ceil(1.3)); // 2.0
    System.out.println(Math.ceil(1.4)); // 2.0
    System.out.println(Math.ceil(1.5)); // 2.0
    System.out.println(Math.ceil(1.6)); // 2.0
}*/
