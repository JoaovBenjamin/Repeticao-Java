package Laço_For;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro positivo do usuário e imprima a tabela de multiplicação desse número até o valor 10.
public class exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        for(int i = 1;i <=10;i++ ){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
