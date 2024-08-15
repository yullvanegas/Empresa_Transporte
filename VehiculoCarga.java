public class VehiculoCarga extends Vehiculo {
    // Atributos adicionales
    private double capacidadCarga;
    private int numeroEjes;

    // Constructor
    public VehiculoCarga(String placa, String modelo, String marca, String color, String tamano, Propietario propietario,
                         double capacidadCarga, int numeroEjes) {
        super(placa, modelo, marca, color, tamano, propietario);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    // Getters y Setters

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga [capacidadCarga=" + capacidadCarga + ", numeroEjes=" + numeroEjes +
                ", " + super.toString() + "]";
    }
}