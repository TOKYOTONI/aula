package Aula2;

import java.util.Scanner;

public class Somardois {
    public static void main(String[] args){

        System.out.println("Criei um calculadora para somar");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int  PrimeiroNumero = scanner.nextInt();

        System.out.println("digite o segundo número");
        int SegundoNumero = scanner.nextInt();

        int ResultadoDaSoma = PrimeiroNumero + SegundoNumero;

        System.out.println("a soma de " + PrimeiroNumero + " e " + SegundoNumero + " é: " + ResultadoDaSoma);

        scanner.close();
    }

    
}
