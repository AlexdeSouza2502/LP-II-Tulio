import java.util.Scanner;

/**
 *
 * @author Alex Jr
 */
public class exercicio8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a altura da parede: ");
        double alturaParede = scanner.nextDouble();
        
        System.out.print("Digite a largura da parede: ");
        double larguraParede = scanner.nextDouble();
        
        System.out.print("Digite a altura do azulejo: ");
        double alturaAzulejo = scanner.nextDouble();
        
        System.out.print("Digite a largura do azulejo: ");
        double larguraAzulejo = scanner.nextDouble();
        
        double areaParede = alturaParede * larguraParede;
        double areaAzulejo = alturaAzulejo * larguraAzulejo;
        
        int quantidadeAzulejos = (int) Math.ceil(areaParede / areaAzulejo);
        
        System.out.printf("Quantidade de azulejos necessários: %d\n", quantidadeAzulejos);
    }
}

  

