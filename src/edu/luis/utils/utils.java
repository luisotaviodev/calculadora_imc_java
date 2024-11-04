package edu.luis.utils;
import java.util.Scanner;

public class utils {

  public static String RealizarCalculoIMC(String cNome, double nPeso, double nAltura){
    nAltura = nAltura * nAltura;

    double nIMC = nPeso / nAltura;
    String cClassicacaoIMC = "";

    if (nIMC < 18.5) {
        cClassicacaoIMC = "MAGREZA";    
    }else if (nIMC < 24.9) {
        cClassicacaoIMC = "NORMAL"; 
    }else if (nIMC < 29.9) {
        cClassicacaoIMC = "SOBREPESO";
    }else if (nIMC < 39.9) {
        cClassicacaoIMC = "OBESIDADE";
    }else if (nIMC >= 40.0) {
        cClassicacaoIMC = "OBESIDADE GRAVE";
    }

    return String.format("Olá %s, seu IMC é de %.1f e está classificado como %s", cNome, nIMC, cClassicacaoIMC);
  }

  public static double lerNumero(Scanner scanner){
       while (true) {
            String input = scanner.nextLine().replace(',', '.');
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
            }
        }
   }
   
}