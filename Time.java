
public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public void setTime(int h, int m, int s){
        hora = h;
        minuto = m;
        segundo = s;
    }

    public String exibirHoraUniversal(){
        String Universal = hora + ":" + minuto + ":" + segundo;
        return Universal;
    }

    public String exibirHoraPadrao(){
        String Universal;
        if(hora >= 13){
            switch(hora){
                case 13: hora = 1; break;
                case 14: hora = 2; break;
                case 15: hora = 3; break;
                case 16: hora = 4; break;
                case 17: hora = 5; break;
                case 18: hora = 6; break;
                case 19: hora = 7; break;
                case 20: hora = 8; break;
                case 21: hora = 9; break;
                case 22: hora = 10; break;
                case 23: hora = 11; break;
                case 00: hora = 12; break;

            }
                Universal = hora + ":" + minuto + ":" + segundo +" PM";
        }
        else{
                Universal = hora + ":" + minuto + ":" + segundo + " AM";
        }
       
        return Universal;
    }
}