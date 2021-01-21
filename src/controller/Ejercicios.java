package controller;

public class Ejercicios {

    public static boolean esPar(int number){
        return number % 2 == 0;
    }

    public static boolean esDivisible(int a, int b){
        return a % b == 0;
    }

    public static  boolean esPrimo(int number)
    {
        int divisores = 0;
        for (int i = 1; i <= number; i++)
        {
            if (number%i == 0) { divisores++; }
        }
        return  divisores == 2;
    }
}
