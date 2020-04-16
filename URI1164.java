import java.util.Scanner;

public class URI1164 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int N,soma=0;

        N = teclado.nextInt();

        for(int i=1; i<N ;i++){
            soma = soma + (soma + 1);
        }
        if(soma==N){
            System.out.println("Numero perfeito");
        }
        else{
            System.out.println("Numero imperfeito");
        }
    }
}