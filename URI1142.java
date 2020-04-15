import java.util.Scanner;

public class URI1142 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, j=1;

        N = teclado.nextInt();

        for(int i = 0; i < N; i++){
            for(int m = 0; m < 3; m++){
                System.out.printf("%d ",j);
                j++;
            }
                j++;
                System.out.println("PUM");   
        }      
    }
}
