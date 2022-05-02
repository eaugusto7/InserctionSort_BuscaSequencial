package inserctionsort_buscasequencial;

import java.util.Random;

public class InserctionSort {

    public static void Inserction(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }

    }

    public static int BuscaSequencial(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int tam1 = 100000;

        int vetor1[] = new int[tam1 + 1];
        int vetor2[] = new int[tam1 + 1];
        int vetor3[] = new int[tam1 + 1];

        for (int i = 0; i < tam1; i++) //Crescente
        {
            vetor1[i] = i;
        }

        for (int i = 0; i < tam1; i++) //Decrescente
        {
            vetor2[i] = tam1 - i;
        }

        Random valor1 = new Random(tam1); //Aleatorio
        for (int i = 0; i < tam1; i++) {
            vetor3[i] = valor1.nextInt();
        }

        long inicio1 = System.nanoTime();
        Inserction(vetor1);
        BuscaSequencial(vetor1, tam1/2);
        long fim1 = System.nanoTime();
        System.out.println("Vetor ordenado: "+(fim1 - inicio1) + " nanosegundos");

        long inicio2 = System.nanoTime();
        Inserction(vetor2);
        BuscaSequencial(vetor2, tam1/2);
        long fim2 = System.nanoTime();
        System.out.println("Vetor na ordem inversa: "+(fim2 - inicio2) + " nanosegundos");

        long inicio3 = System.nanoTime();
        Inserction(vetor3);
        BuscaSequencial(vetor3, tam1/2);
        long fim3 = System.nanoTime();
        System.out.println("Vetor na ordem aleatória: "+(fim3 - inicio3) + " nanosegundos");

    }

}
