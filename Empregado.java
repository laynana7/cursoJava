
public class Empregado {

    private String nome;
    private double salario;

    public Empregado(String n, double s){
        nome = n;
        salario = s;
    }

    public void imprimir(){
        System.out.println("COLABORADOR: "+nome);
        System.out.println("SALARIO ATUAL: R$ "+salario);
    }
    public void aumentarSalario(double percentual){
        double prc = percentual;
        System.out.printf("REAJUSTE DE %.2f",prc);
        prc = prc / 100;
        salario = salario + (salario * prc);
        System.out.printf("\nSALARIO REAJUSTADO: R$ %.2f",salario);
    }

}