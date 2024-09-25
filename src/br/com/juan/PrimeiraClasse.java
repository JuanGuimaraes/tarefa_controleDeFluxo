package br.com.juan;

import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = s.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = s.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = s.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = s.nextDouble();

        System.out.println("****Notas****");

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7){
            System.out.println("Você foi aprovado, sua nota media é: " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("Você está de recuperação, sua media é : " + media);
        } else {
            System.out.println("Você foi reprovado, sua media é: " + media);
        }
    }
}
