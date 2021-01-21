package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elegir nª ejercicio: ");
        int ejercicio = scanner.nextInt();
        switch (ejercicio){
            case 1:
                ejercicioUno(scanner);
                break;
            case 2:
                ejercicioDos(scanner);
                break;
            case 3:
                ejercicioTres(scanner);
                break;
            case 4:
                ejercicioCuatro(scanner);
                break;
        }

    }

    public static void ejercicioUno(Scanner scanner){

        System.out.println("Ingrese un número: ");
        int number = scanner.nextInt();
        List<Integer> par_numbers = new ArrayList<Integer>();

        for (int i = 0; i <= number; i++){
            if(Ejercicios.esPar(i)){
                par_numbers.add(i);
            }
        }
        for (Integer par : par_numbers) {
            System.out.println(par);
        }
    }

    public static void ejercicioDos(Scanner scanner){
        System.out.print("Ingrese el primer número: ");
        int numero = scanner.nextInt();
        System.out.print("¿Cuántos multiplos quiere ver? Ingrese el número: ");
        int multiplos = scanner.nextInt();

        List<Integer> divisores_list = new ArrayList<Integer>();

        for (int i = 1; i <= numero; i++){
            if(Ejercicios.esDivisible(numero, i)){
                divisores_list.add(i);
            }
        }

        for (int j = 0; j < multiplos; j++) {
            System.out.println("El número " + divisores_list.get(j) + " es múltiplo de " + numero);
        }
    }

    public static void ejercicioTres(Scanner scanner)
    {
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();
        System.out.print(number);
        if (Ejercicios.esPrimo(number)) {System.out.println(" es primo");}
        else {System.out.println(" no es primo");}
    }

    public static void ejercicioCuatro(Scanner scanner)
    {
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++)
        {
            if(Ejercicios.esPrimo(i)) { System.out.println(i); }
        }
    }
}
