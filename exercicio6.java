/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;

public class exercicio6 {
      public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();
        
        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        
        double area = comprimento * largura;
        double perimetro = 2 * comprimento + 2 * largura;
        
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimetro);
    }
}


