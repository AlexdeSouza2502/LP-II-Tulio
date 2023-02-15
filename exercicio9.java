import java.util.Scanner;

/**
 *
 * @author Alex Jr
 */
public class exercicio9 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a área total do terreno em metros quadrados: ");
        double areaTotal = sc.nextDouble();

        System.out.print("Informe a área construída do terreno em metros quadrados: ");
        double areaConstruida = sc.nextDouble();

        double valorConstruida = areaConstruida * 5.00;
        double valorNaoConstruida = (areaTotal - areaConstruida) * 3.80;
        double valorTotal = valorConstruida + valorNaoConstruida;

        System.out.printf("O valor total a ser pago é de R$ %.2f", valorTotal);

        sc.close();
    }
}
   

