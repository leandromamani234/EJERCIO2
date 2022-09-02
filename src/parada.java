public class parada {
    int numero;
    String direccion;
    linea linea;
    String horario;
    public parada(){
    }
    public parada(int numero, String direccion, linea linea, String horario) {
        this.numero = numero;
        this.direccion = direccion;
        this.linea = linea;
        this.horario = horario;
    }
}
