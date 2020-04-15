/*  Este programa eh um exemplo de como se fazer uma leitura de dados 
    vinda do teclado, pequeno calculo e exibir resultado final em tela */

import java.util.Scanner;

public class leitura {
    public static void main(final String args[]) {

        /* Entrada de dados*/
        int valor;
        System.out.println("Digite um valor:");
        
        Scanner teclado;
        teclado = new Scanner(System.in);

        valor = teclado.nextInt();

        /* Processamento */
        valor = valor * 100;

        /* Saída */
        System.out.print("Novo valor:"+ valor);
    }
}