import java.util.Scanner;

public class URI1177 {
    public static void main(String arg[]){
        int vet[];
        vet = new int[1000];
        int vlr,inc=0;
        Scanner teclado = new Scanner(System.in);

        vlr = teclado.nextInt();

        for(int i=0 ; i<1000; i++){
            if(inc != vlr){
                vet[i] = inc;
                inc++;
            }
            else{
                inc = 0;
            }
            System.out.println("N["+i+"] = "+inc);
        }
    }
}