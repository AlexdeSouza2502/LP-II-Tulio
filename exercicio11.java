

/**
 *
 * @author Alex Jr
 */
import java.util.Scanner;
public class exercicio11 {
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           System.out.print("Informe o número de dias de locação: ");
           int dias = sc.nextInt();
           
           System.out.print("Informe a quilometragem percorrida: ");
           double km = sc.nextDouble();
           
           double custoFixo = dias * 45.00;
           double kmExcedido = (km - (dias * 60)) * 0.50;
           double valorTotal = custoFixo + kmExcedido;
           
           System.out.printf("O valor total a ser pago é de R$ %.2f", valorTotal);
       }
    }
}

 

