import java.util.Scanner;
public class URI1074 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n1,n2;

        n1 = teclado.nextInt();

        for(int i = 0; i < n1; i++){

            n2 = teclado.nextInt();

            if(n2 == 0){
                System.out.println("NULL");
            }
            else{
                if(n2 > 0){
                    if(n2 % 2 == 0){
                        System.out.println("EVEN POSITIVE");
                    }
                    else{
                        System.out.println("ODD POSITIVE");
                    }
                }
                else{
                    if(n2 < 0){
                        if(n2 % 2 == 0){
                            System.out.println("EVEN NEGATIVE");
                        }
                        else{
                            System.out.println("ODD NEGATIVE");
                        }
                    }
                }
            }
        } 
    }
}