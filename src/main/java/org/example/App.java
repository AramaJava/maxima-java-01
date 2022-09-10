package org.example;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {

        int arr1[] = {66799, 9999999, 12, 66799, 999999};
       // System.out.println(maxDigitsSumPosition(arr1));

        //    System.out.println(daysCount((byte) 2, 2024));

        System.out.println(isSimple(5));
        System.out.println(isSimple(3));
        System.out.println(isSimple(9));
        System.out.println(isSimple(77));
    }


    public static byte daysCount(byte month, int year) {
            switch (month) {
            case 2:
                return (byte) (isVisgod(year) ? 29 : 28); // проверка высокосного года
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1; // вернет если ошибка в номере месяца

        }

    }

    public static boolean Vis_god1(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0;
    }

    public static boolean isVisgod(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public static int isSimple(int n) {
         for (int i = 2; i < n; i++) {
            if (n % i == 0) return  i;
            }
         return 0;
    }
    public static byte maxDigitsSumPosition (int[] arr) {
        int sumChisel = 0;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int s = 0;
                while (n>0) {
                    s += n % 10;
                    n /= 10;
                }
                if (s >= sumChisel) {
                sumChisel = s;
                pos = i;
                }
            }
        return (byte) pos;
    }

}
