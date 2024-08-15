import java.util.ArrayList;
import java.util.List;

public class Propietario {
    // Atributos
    private String nombre;
    private String id;
    private String email;
    private String celular;
    private Vehiculo vehiculo; // Asociación con Vehiculo

    private List<VehiculoCarga> listaVehiculosAsociados = new ArrayList<>();

    public Propietario(String nombre, String id, String email, String celular) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.celular = celular;
        this.vehiculo = vehiculo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<VehiculoCarga> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    public void setListaVehiculosAsociados(List<VehiculoCarga> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", id=" + id + ", email=" + email + ", celular=" + celular + "]";
    }
}
