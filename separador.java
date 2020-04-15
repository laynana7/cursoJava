import java.util.Scanner;

public class separador {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero, un, de, ce, re;

        System.out.println("Digite um numero de 3 digitos: ");
        numero = teclado.nextInt();

        ce = numero / 100;
        re = numero % 100;
        de = re / 10;
        un = re % 10;

        System.out.println("Centenas: "+ce);
        System.out.println("Dezenas:  "+de);
        System.out.println("Unidades: "+un);

    }
}