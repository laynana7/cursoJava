import java.util.Scanner;
public class URI1180 {
    public static void main(String arg[]){
        int vetor[];
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();
        int x;
        vetor = new int[N];

        for(int i = 0; i<N; i++){
            x = teclado.nextInt();
            vetor[i] = x;
        }

        x = 0;

        for(int i = 0; i<N; i++){
            if(i==0){
                if(vetor[i]<vetor[i+1]){
                    x = vetor[i];
                }
                else{
                    x = vetor[i+1];
                }
            }
            else{
                if(vetor[i]<vetor[i+1]){
                    if(vetor[i] < x ){
                        x = vetor[i];
                    }
                }
                else{
                    if(vetor[i+1] < x){
                        x = vetor[i+1];
                    }
                }
            }
        }
        System.out.println("Menor posicao = "+x);
    }
}