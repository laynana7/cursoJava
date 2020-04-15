/* 
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis 
(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, 
conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, 

*/

import java.util.Scanner;

public class URI1018 {
    public static void main(String args[]){
        int cem, cinquenta, vinte, dez, cinco, dois, um;
        int resto;

        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        cem = valor / 100;
        resto = valor % 100;
        cinquenta = resto / 50;
        resto = resto % 50;
        vinte = resto / 20;
        resto = resto % 20;
        dez = resto / 10;
        resto = resto % 10;
        cinco = resto / 5;
        resto = resto % 5;
        dois = resto / 2;
        resto = resto % 2;
        um =  resto / 1;
        resto = resto % 1;

        System.out.printf("%d\n", valor);
        System.out.printf("%d nota(s) de R$ 100\n",cem);
        System.out.printf("%d nota(s) de R$ 50\n",cinquenta);
        System.out.printf("%d nota(s) de R$ 20\n",vinte);
        System.out.printf("%d nota(s) de R$ 10\n",dez);
        System.out.printf("%d nota(s) de R$ 5\n",cinco);
        System.out.printf("%d nota(s) de R$ 2\n",dois);
        System.out.printf("%d nota(s) de R$ 1\n",um);


    }
}