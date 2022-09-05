package org.example;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( fibonazzi ((byte) 22));
    }

    public static long fibonazzi (byte N)
    {
        return N < 2 ? N : fibonazzi((byte) (N-1)) + fibonazzi((byte) (N-2));
    }
}
