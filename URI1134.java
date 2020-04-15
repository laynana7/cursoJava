import java.util.Scanner;
public class URI1134 {
    public static void main(String args[]){
        int alcool=0, gasolina=0, diesel=0,opc;
        Scanner teclado = new Scanner(System.in);

        do{
            opc = teclado.nextInt();
            if(opc==1){
                alcool++;
            }
            if(opc==2){
                gasolina++;
            }
            if(opc==3){
                diesel++;
            }

        }while(opc!=4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}