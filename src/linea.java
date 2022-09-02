import java.util.List;

public class linea {
    String nombre;
    List<autobus> autobus;
    List<parada>parada;
    public linea(){
    }
    public linea(String nombre, List<autobus> autobus, List<parada> parada) {
        this.nombre = nombre;
        this.autobus = autobus;
        this.parada = parada;
    }
}
