import java.util.Scanner;
import edu.luis.utils.utils;

public class calculadoraIMC {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {"seu Nome:", "seu Peso:", "sua Altura:"}; 
        String cNome = "";
        double nPeso = 0.0;
        double nAltura = 0.0;
        
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Digite " + perguntas[i]);
            if (i == 0) {
                cNome = scanner.nextLine();
            } else if (i == 1) {
                nPeso = utils.lerNumero(scanner);
            } else if (i == 2) {
                nAltura = utils.lerNumero(scanner);
            }
        }

        System.out.println(utils.RealizarCalculoIMC(cNome, nPeso, nAltura));
        scanner.close();
    }
}
