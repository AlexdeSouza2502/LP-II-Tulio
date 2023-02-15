

/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String palavra = input.nextLine();
            
            int contador = 0;
            
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.substring(i, i+1).equals("a") || palavra.substring(i, i+1).equals("A")) {
                    contador++;
                }
            }
            
            System.out.println("A palavra " + palavra + " possui " + contador + " letras \"a\".");
        }
    }
}

  

