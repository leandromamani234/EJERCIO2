public class tickeo {
    Autobus Autobus;
    parada parada;
    String horario;
    Integer suben;
    Integer bajan;
    public tickeo(){
    }

    public tickeo(Autobus autobus, parada parada, String horario, Integer suben, Integer bajan) {
        Autobus = autobus;
        this.parada = parada;
        this.horario = horario;
        this.suben = suben;
        this.bajan = bajan;
    }
}
