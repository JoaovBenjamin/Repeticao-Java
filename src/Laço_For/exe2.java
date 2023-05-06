package Laço_For;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro positivo do usuário e calcule o fatorial desse número usando um laço FOR.
public class exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        int fat = 1;

        for (int i=1;i<=num;i++) {
            fat *= i;
        }
        System.out.println("i = " + fat);
    }
}
