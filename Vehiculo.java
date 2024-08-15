public class Vehiculo {
    // Atributos
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private String tamano;
    private Propietario propietario;  // Asociación con la clase Usuario

    // Constructor
    public Vehiculo(String placa, String modelo, String marca, String color, String tamano, Propietario propietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.tamano = tamano;
        this.propietario = propietario;  // Inicialización de la referencia al Usuario
    }

    // Getters y Setters

    // Getter para placa
    public String getPlaca() {
        return placa;
    }

    // Setter para placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Getter para modelo
    public String getModelo() {
        return modelo;
    }

    // Setter para modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter para marca
    public String getMarca() {
        return marca;
    }

    // Setter para marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para color
    public String getColor() {
        return color;
    }

    // Setter para color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter para tamaño
    public String getTamano() {
        return tamano;
    }

    // Setter para tamaño
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    // Getter para propietario
    public Propietario getPropietario() {
        return propietario;
    }

    // Setter para propietario
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Vehiculo [placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color +
                ", tamaño=" + tamano + ", usuario=" + (propietario != null ? propietario.toString() : "No asignado") + "]";
    }
}
