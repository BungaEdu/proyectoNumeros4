package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioContarNumeros {

    public static void main(String[] args) {
        Integer[] arrayCad = new Integer[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la cadena: ");
        String cadena= sc.nextLine();

        char cadenaToChar[]= cadena.toCharArray();

        System.out.println(contarRepeticiones(cadenaToChar));

    }

    public static String contarRepeticiones(char[] array) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char caracter : array) {
            if (map.containsKey(caracter)) {
                Integer value = map.get(caracter);
                value++;
                map.replace(caracter, value);
            } else {
                map.put(caracter, 1);
            }
        }
        return map.toString();

    }
}