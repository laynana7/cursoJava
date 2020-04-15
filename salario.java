/* Voce foi contratado para fazer o calculo do salario de um novo colaborador do time de DEVs
O calculo eh estipulado da seguinte maneira: 
Dado o salario, o imposto fixo eh 15%
Voce deve informar o salario que foi digitado, o imposto que foi calculoado e o salario liquido no final 

    - Meu programa sabe quanto vale o salario do funcionario?
        NAO - Preciso informa-lo (Entrada de dados);

    - Sei como calcular o imposto?
        SIM - para isso vamos precisar do valor do salario e tambem armazenar esse imposto calculado
    - Sei como calcular o salario liquido?
        SIM - a partir do valor do salario original e do imposto calculado, conseguimos subtrair esse valor 
        e ter o salario liquido

    Como fica entao?
    PASSO 1: Sabe quanto vale o salario
    PASSO 2: Calcular o imposto que eh de 15%
    PASSO 3: Subtrair passo 1 do passo 2
    PASSO 4: Exibir em tela

*/

import java.util.Scanner;

public class salario {
    public static void main(final String args[]) {
        /* Entrada */
        Scanner teclado;
        teclado = new Scanner(System.in);
        float salario, imposto, sal_liq;

        System.out.print("Digite o salario bruto: ");
        salario = teclado.nextFloat();

        /* Processamento */
        imposto = salario * 15 / 100;
        sal_liq = salario - imposto;

        /* Saida */
        System.out.printf("Salario Bruto: R$ "+salario);
        System.out.printf("Imposto: R$ "+imposto);
        System.out.printf("Salario Liquido: R$ "+sal_liq);

    }
}