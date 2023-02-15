/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;
public class exercicio5 {
   public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a sua altura (em metros): ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.printf("Seu IMC é %.2f\n", imc);
        
        if (imc < 19.1) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (imc >= 19.1 && imc <= 25.8) {
            System.out.println("Seu peso está dentro da faixa ideal.");
        } else if (imc > 25.8 && imc < 30.0) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está obeso.");
        }
    }
}
  

