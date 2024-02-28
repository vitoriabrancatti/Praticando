package Praticando;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int primeironumero = scanner.nextInt();

        System.out.println("Insira o segundo número: ");
        int segundonumero = scanner.nextInt();
        
        int soma = primeironumero + segundonumero;
        System.out.println("A soma dos dois números é: " + soma);
    }
}
