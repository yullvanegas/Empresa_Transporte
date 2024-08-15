import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Empresa {
    private String nombreEmpresa;
    private List<VehiculoPasajero> listaVehiculosPasajeros;
    private List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();

    private List<Propietario> listaPropietarios = new ArrayList<>();

    // Constructor
    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaVehiculosPasajeros = new ArrayList<>();
    }

    // Getter y Setter para nombreEmpresa
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public List<VehiculoPasajero> getListaVehiculosPasajeros() {
        return listaVehiculosPasajeros;
    }

    public void setListaVehiculosPasajeros(List<VehiculoPasajero> listaVehiculosPasajeros) {
        this.listaVehiculosPasajeros = listaVehiculosPasajeros;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    // Método para agregar un VehiculoPasajero a la lista
    public void agregarVehiculoPasajero(VehiculoPasajero vehiculo) {
        this.listaVehiculosPasajeros.add(vehiculo);
    }

    // Método para calcular y mostrar el total de pasajeros por placa
    public void mostrarTotalPasajerosPorPlaca() {
        Map<String, Integer> totalPasajerosPorPlaca = new HashMap<>();

        for (VehiculoPasajero vehiculo : listaVehiculosPasajeros) {
            String placa = vehiculo.getPlaca();
            int numeroMaxPasajeros = vehiculo.getNumeroMaxPasajeros();

            // Actualizar el total de pasajeros para la placa correspondiente
            totalPasajerosPorPlaca.put(placa, totalPasajerosPorPlaca.getOrDefault(placa, 0) + numeroMaxPasajeros);
        }

        // Imprimir el total de pasajeros por número de placa
        System.out.println("Total de pasajeros transportados por número de placa para la empresa " + nombreEmpresa + ":");
        for (Map.Entry<String, Integer> entry : totalPasajerosPorPlaca.entrySet()) {
            String placa = entry.getKey();
            int totalPasajeros = entry.getValue();
            System.out.println("Placa: " + placa + ", Total Pasajeros: " + totalPasajeros);
        }
    }

    // Método toString para representar la empresa
    @Override
    public String toString() {
        return "Empresa [nombreEmpresa=" + nombreEmpresa + "]";
    }
}
