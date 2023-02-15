

/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;

public class exercicio13 {
     public static void main(String[] args) {
         try (Scanner input = new Scanner(System.in)) {
             System.out.print("Digite o número de pessoas no grupo: ");
             int numPessoas = input.nextInt();
             
             System.out.print("Digite o número de dias do pacote turístico: ");
             int numDias = input.nextInt();
             
             double precoPorPessoa;
             
             if (numPessoas >= 1 && numPessoas <= 4) {
                 precoPorPessoa = 160.00;
             } else if (numPessoas >= 5 && numPessoas <= 8) {
                 precoPorPessoa = 120.00;
             } else {
                 precoPorPessoa = 80.00;
             }
             
             double precoTotal = numPessoas * precoPorPessoa * numDias;
             
             System.out.printf("O valor a ser pago pelo grupo é: R$ %.2f", precoTotal);
         }
    }
}


