import java.util.Scanner;

public class altura {
    public static void main(String args[]){
        int s;
        float p, a;

        Scanner teclado = new Scanner(System.in);

        System.out.println("-- Informe o seu sexo --");
        System.out.printf("1: Homem\n2: Mulher\nResposta: ");
        s = teclado.nextInt();

        System.out.println("-- Informe o sua altura --");
        System.out.printf("Resposta: ");
        a = teclado.nextFloat();

        if(s == 1){
            p = 72.7f * a - 58;
            System.out.printf("Voce eh homem e seu peso ideal eh %.2f",p);
        }
        else{
            if(s ==2){
                p = 62.1f * a - 44.7f;
                System.out.println("Voce eh mulher e seu peso ideal eh "+p);
            }
            else{
                System.out.printf("Opcao invalida");
            }
        }
    }
}