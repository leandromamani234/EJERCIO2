import java.util.Date;

public class incidencia {
        Date fecha;
        double costo;
        String descripcion;
        String tipo;
        public incidencia(){
        }
        public incidencia(Date fecha, double costo, String descripcion, String tipo) {
            this.fecha=fecha;
            this.costo=costo;
            this.descripcion=descripcion;
            this.tipo=tipo;
        }
}
