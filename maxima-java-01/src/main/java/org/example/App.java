package org.example;

import java.awt.*;

public class App
{
    public static void main( String[] args )
    {
        String a = "aaaaa";
        String b = "bbbbb";
        String c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b+"\n");

        // если переменные логические то можно и без третьей переменной

        boolean A = true;
        boolean B = false;

        System.out.println("Значение A: " + !A);
        System.out.println("Значение B: " + !B + "\n");

        // через xor без третьей

        byte a1 = 30;
        byte b1 = -40;
        a1^=b1;
        b1^=a1;
        a1^=b1;
        System.out.println("Значение a1: " + a1);
        System.out.println("Значение b1: " + b1 + "\n");

        // через сложение)) и без применения третьей переменной
        int e = 2147483647;
        int f = 20;
        e = e + f; //e=30 а f еще 20
        f = e - f; //f=10 а 10 это значение e при инициализации
        e = e - f; // от суммы отнимаем f получим для e значение бывшее у f

        System.out.println("Значение e: " + e);
        System.out.println("Значение f: " + f + "\n");

        // вопрос почему не бывает переполнения? я для int е брал максимальное значение 2147483647 и ошибки не было!!!


        // еще вариант

        int aa = 20;
        int bb = 1000;
        aa = aa + 2 * (bb - aa);
        bb = bb - (aa - bb);
        aa = aa - (aa - bb)/2;
        System.out.println("Значение aa: " + aa);
        System.out.println("Значение bb: " + bb + "\n");


        // через деление)) и без применения третьей переменной
        double m = 10.333;
        double n = 52.46;
        m = m / n;
        n = n * m;
        m = n / m;

        System.out.println("Значение m: " + m);
        System.out.println("Значение n: " + n +"\n");

    }
}
