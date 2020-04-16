import java.util.Scanner;

public class URI114 {
    public static void main(String args[]){
        int senha = 2002;
        int input;
        Scanner teclado = new Scanner(System.in);

        do{
            input = teclado.nextInt();
            if(senha != input){
                System.out.println("Senha Invalida");
            }
            else{
                System.out.println("Acesso Permitido");
            }
        }while(senha != input);  
    }
}