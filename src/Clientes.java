import java.util.ArrayList;

public class Clientes {
    private String dni;
    private String nombre;
    private String apellidos;
    private ArrayList <Ventas> ventas;

    public ArrayList<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Ventas> ventas) {
        this.ventas = ventas;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private String direccion;
}
