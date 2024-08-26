package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número inteiro
        System.out.print("Insira um número inteiro: ");
        String input = scanner.nextLine();

        // Usa um wrapper para converter a string para um Integer
        Integer number = Integer.valueOf(input);

        // Faz o casting do Integer para um tipo primitivo int
        int primitiveInt = number.intValue();

        // Exibe o resultado
        System.out.println("O número inserido foi: " + primitiveInt);

        scanner.close();
    }
}
