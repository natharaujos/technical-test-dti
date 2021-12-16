import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetorElemento, vetorTamanho, contador = 0;

        System.out.print("Digite o tamanho do vetor: ");
        vetorTamanho = entrada.nextInt();
        int[] vetorPares = new int [vetorTamanho];

        for (int i = 0; i < vetorTamanho; i++) {
            System.out.print("Digite o elemento do vetor: ");
            vetorElemento = entrada.nextInt();
            vetorPares[i] = vetorElemento;
        }

        for (int i = 0; i < vetorTamanho; i++) {
            if (vetorPares[i]%2 == 0) {
                contador++;
            }
        }

        System.out.printf("Número de pares: %d", contador);

        entrada.close();
    }
}