package org.example;

import java.awt.*;

public class App
{
    public static void main( String[] args )
    {
        String a = "aaaaa";
        String b = "bbbbb";
        System.out.println("Значение было a: " + a);
        System.out.println("Значение было b: " + b);
        String c = a;
        a = b;
        b = c;
        System.out.println("Значение стало a: " + a);
        System.out.println("Значение стало b: " + b + "\n");

        // если переменные логические то можно и без третьей переменной

        boolean A = true;
        boolean B = false;
        System.out.println("Значение было A: " + A);
        System.out.println("Значение было B: " + B);
        System.out.println("Значение стало A: " + !A);
        System.out.println("Значение стало B: " + !B + "\n");

        // через xor без третьей

        byte a1 = 30;
        byte b1 = -40;
        System.out.println("Значение было a1: " + a1);
        System.out.println("Значение было b1: " + b1);
        a1^=b1;
        b1^=a1;
        a1^=b1;
        System.out.println("Значение стало a1: " + a1);
        System.out.println("Значение стало b1: " + b1 + "\n");

        // через сложение)) и без применения третьей переменной
        int e = 2147483647;
        int f = 20;
        System.out.println("Значение было e: " + e);
        System.out.println("Значение было f: " + f);
        e = e + f; //e=30 а f еще 20
        f = e - f; //f=10 а 10 это значение e при инициализации
        e = e - f; // от суммы отнимаем f получим для e значение бывшее у f
        System.out.println("Значение стало e: " + e);
        System.out.println("Значение стало f: " + f + "\n");

        // вопрос почему не бывает переполнения? я для int е брал максимальное значение 2147483647 и ошибки не было!!!


        // еще вариант без использования третьей переменной

        int aa = 20;
        int bb = 1000;
        System.out.println("Значение было аа: " + aa);
        System.out.println("Значение было bb: " + bb);

        aa = aa + 2 * (bb - aa);
        bb = bb - (aa - bb);
        aa = aa - (aa - bb)/2;

        System.out.println("Значение стало aa: " + aa);
        System.out.println("Значение стало bb: " + bb + "\n");


        // через деление)) и без применения третьей переменной
        float m = 10.333F;
        float n = 52.46F;
        System.out.println("Значение было m: " + m);
        System.out.println("Значение было n: " + n);

        m = m / n;
        n = n * m;
        m = n / m;

        System.out.println("Значение стало m: " + m);
        System.out.println("Значение стало n: " + n +"\n");

    }
}
