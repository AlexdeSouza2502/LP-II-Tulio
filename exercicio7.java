/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;


public class exercicio7 {
      public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota do 1º bimestre: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a nota do 2º bimestre: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a nota do 3º bimestre: ");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Digite a nota do 4º bimestre: ");
        double nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        
        System.out.printf("Média: %.2f\n", media);
        
        if (media < 3.5) {
            System.out.println("Situação: Reprovado");
        } else if (media < 6.5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Aprovado");
        }
    }
}


