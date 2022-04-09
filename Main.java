import java.util.*;

class Main {
  public static void main(String[] args) {
    Random aleartorio = new Random();

    int linha = 10;
    int coluna = 5;
    int somaVetor = 0;

    int matriz[][] = new int[linha][coluna];

    int vetor[] = new int[coluna];


    System.out.println("\n:::Matriz Inicial:::\n");

    for (int l = 0; l < linha; l++) {//gera matriz
      for (int c = 0; c < coluna; c++) {
        matriz[l][c] = aleartorio.nextInt(10);
      }
    }

    for (int l = 0; l < linha; l++) {//imprimi matriz
      for (int c = 0; c < coluna; c++) {
        System.out.print("|" + matriz[l][c] + "|\t");
      }
      System.out.println();
    }

    for (int l = 0; l < linha; l++) {//obtem soma das colunas
      for (int c = 0; c < coluna; c++) {
        vetor[c] = matriz[l][c] + vetor[c];
      }
      System.out.println();
    }

    for (int c = 0; c < coluna; c++) {//soma os elementos do vetor
      somaVetor = vetor[c] + somaVetor;

    }

        for (int l = 0; l < linha; l++) {//atualiza matriz
      for (int c = 0; c < coluna; c++) {
        matriz[l][c] = somaVetor * matriz[l][c];
      }
    }
    System.out.println("\n:::Matriz Atualizada:::\n");

        for (int l = 0; l < linha; l++) {//imprimi matriz
      for (int c = 0; c < coluna; c++) {
        System.out.print("|" + matriz[l][c] + "|\t\t\t\t");
      }
      System.out.println();
    }






  }
}