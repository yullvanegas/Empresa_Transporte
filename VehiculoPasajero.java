public class VehiculoPasajero extends Vehiculo {
    // Atributos adicionales
    private int numeroMaxPasajeros;

    // Constructor
    public VehiculoPasajero(String placa, String modelo, String marca, String color, String tamano, Propietario propietario,
                            int numeroMaxPasajeros) {
        super(placa, modelo, marca, color, tamano, propietario);
        this.numeroMaxPasajeros = numeroMaxPasajeros;
    }

    // Getters y Setters

    public int getNumeroMaxPasajeros() {
        return numeroMaxPasajeros;
    }

    public void setNumeroMaxPasajeros(int numeroMaxPasajeros) {
        this.numeroMaxPasajeros = numeroMaxPasajeros;
    }

    @Override
    public String toString() {
        return "VehiculoPasajero [numeroMaxPasajeros=" + numeroMaxPasajeros +
                ", " + super.toString() + "]";
    }
}