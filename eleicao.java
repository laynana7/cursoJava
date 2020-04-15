import java.util.Scanner;

public class eleicao {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.printf("-- Informe a sua idade --\n\n");
        idade = teclado.nextInt();

        if(idade < 18){
            System.out.println("Voce tem "+idade+" e voce nao pode votar ainda.");
        }
        else{
            if(idade > 18 && idade < 65){
                System.out.println("Voce tem "+idade+" e o seu voto eh obrigatorio.");
            }
            else{
                System.out.printf("Sua idade eh "+idade+" e seu voto eh facultativo");
            }
        }
    }
}