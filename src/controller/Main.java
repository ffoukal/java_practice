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
        System.out.println("Ingrese un número: ");
    }
}
