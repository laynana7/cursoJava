import java.util.Scanner;

public class URI1143 {
    public static void main(String ar[]){
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        int j;

        for(int i = 1; i <= N; i++){
            j=i;
            System.out.printf("%d %d %d\n",i,(j=i*j),(j=i*j));
        }
    }
}