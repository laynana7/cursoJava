import java.util.Scanner;

public class URI1051 {
    public static void main(String args[]){
        float salario, imposto;
        Scanner teclado = new Scanner(System.in);

        salario = teclado.nextFloat();

        if(salario <= 2000.0f){
            System.out.println("Isento");
        }
        else{
            if(salario > 2000.0f && salario <= 3000.0f){
                imposto = (salario-2000.0f) * 0.08f;
                System.out.println("R$ "+imposto);
            }
            else{
                if(salario > 3000.0f && salario <= 4500.0f){
                    imposto = 1000.0f * 0.08f;
                    imposto = imposto + ((salario-3000.0f) * 0.18f);
                    System.out.println("R$ "+imposto);
                }
                else{
                    if(salario > 4500.0f){
                        imposto = 1000.0f * 0.08f;
                        imposto = imposto + (1500.0f * 0.18f);
                        imposto = imposto + ((salario - 4500.0f)*0.28f);
                        System.out.printf("R$ %.2f",imposto);
                    }
                }
            }
        }

    }
}