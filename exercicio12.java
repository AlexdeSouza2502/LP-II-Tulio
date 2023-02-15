

/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;


public class exercicio12 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da renda anual: ");
        double rendaAnual = sc.nextDouble();

        double irpfSimples;

        if (rendaAnual <= 10800.00) {
            irpfSimples = 0.0;
        } else if (rendaAnual <= 21600.00) {
            irpfSimples = rendaAnual * 0.15 - 1620.00;
        } else {
            irpfSimples = rendaAnual * 0.275 - 4320.00;
        }

        System.out.printf("O valor do IRPF Simples a ser pago é de R$ %.2f", irpfSimples);

        sc.close();
    }
}
  

