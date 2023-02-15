/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        double taxaDeConversao = 5.31; // Taxa de conversão atualizada em 14/02/2023
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$) que deseja converter para dólar (USD): ");
        double valorEmReal = scanner.nextDouble();
        double valorEmDolar = valorEmReal / taxaDeConversao;

        System.out.printf("O valor de R$%.2f é equivalente a USD%.2f (taxa de conversão atual: %.2f)\n", valorEmReal, valorEmDolar, taxaDeConversao);
    }
}


