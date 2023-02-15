

/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;

public class exercicio16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();
        int i = 0;
        int count = 0;
        while (i < palavra.length()) {
            if (palavra.substring(i, i+1).equals("a")) {
                count++;
            }
            i++;
        }
        System.out.println("A palavra " + palavra + " tem " + count + " letras 'a'.");
    }

}


