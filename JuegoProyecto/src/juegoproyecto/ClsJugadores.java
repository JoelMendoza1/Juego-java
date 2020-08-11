
package juegoproyecto;
import java.io.Serializable;

public class ClsJugadores implements Serializable {
    
    private String nombre; 
    private String apellido;
    private String cedula;
    private String usuario;
    private int id; 
    private int ContadorV;
    public ClsJugadores() {
    }

    public ClsJugadores(int id, String nombre, String apellido, String cedula, String usuario, int ContadorV) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.usuario = usuario;
        this.id = id;
        this.ContadorV = ContadorV;
    }
    
    

    @Override
    public String toString() {
        return usuario; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContadorV() {
        return ContadorV;
    }

    public void setContadorV(int ContadorV) {
        this.ContadorV = ContadorV;
    }

    
    
    
}
