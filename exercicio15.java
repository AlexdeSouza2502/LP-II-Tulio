

/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;

public class exercicio15 {
    
 public static void main(String[] args) {
     try (Scanner input = new Scanner(System.in)) {
         System.out.print("Digite um número: ");
         String numero = input.nextLine();
         
         boolean capicua = true;
         int inicio = 0;
         int fim = numero.length() - 1;
         
         while (inicio < fim) {
             if (numero.substring(inicio, inicio+1).equals(numero.substring(fim, fim+1))) {
                 inicio++;
                 fim--;
             } else {
                 capicua = false;
                 break;
             }
         }
         
         if (capicua) {
             System.out.println(numero + " é uma capicua.");
         } else {
             System.out.println(numero + " não é uma capicua.");
         }
     }
    }
}


