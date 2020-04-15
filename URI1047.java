import java.util.Scanner;

public class URI1047 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int h1, h2, m1, m2;

        h1 = teclado.nextInt();
        m1 = teclado.nextInt();

        h2 = teclado.nextInt();
        m2 = teclado.nextInt();

        th = h2 - h1;
        tm = m2 - m1;



        if((th <=24) && (tm>=1)){
            System.out.println("O JOGO DUROU "+th+" HORA(S) E "+tm+" MINUTO(S)");
        }
        else{
            System.out.print("periodo invalido");
        }
    }
}