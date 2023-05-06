package Laço_For;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro positivo do usuário e verifique se ele é um número primo.
public class exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        boolean primo = true;
        for(int i=2;i<num;i++){
            if(num %i == 0){
                primo = false;
                    break;
            }

            if(primo){
                System.out.println(num +" O numero é primo");
            }else {
                System.out.println(num + " O numero não é primo: ");
            }
        }
    }
}
