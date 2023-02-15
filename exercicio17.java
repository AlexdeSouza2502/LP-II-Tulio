
/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;


public class exercicio17 {
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int num = sc.nextInt();
        System.out.print("Informe uma letra: ");
        char letra = sc.next().charAt(0);
        
        for (int i = 0; i < num; i++) {
            System.out.print(letra);
        }
    }
}

