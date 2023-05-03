
package jogodaforca_java;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Kristian Lucas e Otávio Cardoso
 * \\Atividade de programação para a disciplina Linguagem de programação 2° semestre de 2023 de ADS - Fatec Bragança Paulista
 */
public class JogoDaForca_Java {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String[] palavra = { "carro", "casa", "computador", "celular", "notebook", "teclado",
                "mouse", "monitor", "cadeira", "mesa", "ventilador", "arcondicionado", "televisao", "geladeira",
                "fogao" };

        Random random = new Random();
        String forca = "  +---+\n" +
                "  |   |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "=========";

        int indice = random.nextInt(palavra.length);
        String palavraSorteada = palavra[indice];

        char[] letras = new char[palavraSorteada.length()];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = '_';
        }

        int tentativas = 0;
        while (tentativas < 6) {
            System.out.println("Digite uma letra: ");
            char letra = entrada.next().charAt(0);
            boolean acertou = false;
            for (int i = 0; i < palavraSorteada.length(); i++) {
                if (palavraSorteada.charAt(i) == letra) {
                    letras[i] = letra;
                    acertou = true;
                    System.out.println(forca);
                }
            }
            if (!acertou) {
                tentativas++;

                if (tentativas == 1) {
                    forca = ("  +---+\n" +
                            "  |   |\n" +
                            "  O   |\n" +
                            "      |\n" +
                            "      |\n" +
                            "      |\n" +
                            "=========");
                    System.out.println(forca);

                } else if (tentativas == 2) {
                    forca = ("  +---+\n" +
                            "  |   |\n" +
                            "  O   |\n" +
                            "  |   |\n" +
                            "      |\n" +
                            "      |\n" +
                            "=========");
                    System.out.println(forca);
                } else if (tentativas == 2) {
                    forca = ("  +---+\n" +
                            "  |   |\n" +
                            "  O   |\n" +
                            " /|   |\n" +
                            "      |\n" +
                            "      |\n" +
                            "=========");
                    System.out.println(forca);
                } else if (tentativas == 3) {
                    forca = ("  +---+\n" +
                            "  |   |\n" +
                            "  O   |\n" +
                            " /|\\  |\n" +
                            "      |\n" +
                            "      |\n" +
                            "=========");
                    System.out.println(forca);
                } else if (tentativas == 4) {
                    forca = ("  +---+\n" +
                            "  |   |\n" +
                            "  O   |\n" +
                            " /|\\  |\n" +
                            " /    |\n" +
                            "      |\n" +
                            "=========");
                    System.out.println(forca);
                } else if (tentativas == 5) {
                    forca = ("  +---+\n" +
                            "  |   |\n" +
                            "  O   |\n" +
                            " /|\\  |\n" +
                            " / \\  |\n" +
                            "      |\n" +
                            "=========");
                    System.out.println(forca);
                }
            }
            System.out.println(letras);
            if (palavraSorteada.equals(new String(letras))) {
                System.out.println("Você ganhou!");
                break;
            }
        }
        if (tentativas == 6) {
            System.out.println("Você perdeu!");
        }
        entrada.close();
    }
}