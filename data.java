/* ano 13042020 /10000
           2020  1304

       1304 / 100
         04   13    
*/          

import java.util.Scanner;
public class data {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int data,dia,mes,ano,resto;

        System.out.println("Digite a data: ");
        data=teclado.nextInt();

        ano = data %  10000;
        resto = data / 10000;
        dia = resto / 100;
        mes = resto % 100;

        System.out.println("Ano: "+ano);
        System.out.println("Mes: "+mes);
        System.out.println("Dia: "+dia);
        
    }
}