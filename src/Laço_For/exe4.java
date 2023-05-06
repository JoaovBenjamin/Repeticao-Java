package Laço_For;

import java.util.Scanner;

//Escreva um programa que leia uma sequência de números inteiros positivos do usuário e calcule a média desses números.
public class exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros voce quer: ");
        int qtd = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i < qtd; i++){
            System.out.println("Digite os numeros: ");
            int num = scanner.nextInt();
            soma+=num;
        }
        float media = soma/qtd;
        System.out.println("A media dos numeros é: " + media);
    }
}
