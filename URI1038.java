import java.util.Scanner;

public class URI1038 {
    public static void main(String args[]){
        int cod, qtd;
        double vlr = 0;
        Scanner teclado = new Scanner(System.in);

        cod = teclado.nextInt();
        qtd = teclado.nextInt();

        switch(cod){
            case 1:
                //Cachorro quente
                vlr = 4.00 * qtd;
            break;
            
            case 2:
                // X-Salada
                vlr = 4.50 * qtd;
            break;

            case 3:
                //X-Bacon
                vlr = 5.00 * qtd;
            break;
                
            case 4:
                //Torrada Simples
                vlr = 2.00 * qtd;
            break;
            
            case 5:
                //Refrigerante
                vlr = 1.50 * qtd;
            break;
        }

        System.out.printf("Total: R$ %.2f",vlr);

    }
}