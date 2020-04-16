
public class TimeTeste {
    public static void main(String ar[]){
        Time tempo = new Time();
        String horario;

        tempo.setTime(15, 16, 04);
        horario = tempo.exibirHoraUniversal();
        System.out.println(horario);
        horario = tempo.exibirHoraPadrao();
        System.out.println(horario);
    }
}