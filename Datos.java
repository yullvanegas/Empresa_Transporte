public class Datos {
    public static void inicializar() {
        // Crear una instancia de la clase Empresa
        Empresa empresa = new Empresa("Transporte XYZ");

        // Crear algunos objetos Usuario
        Propietario propietario1 = new Propietario("Juan Pérez", "123456", "juan.perez@example.com", "555-1234");
        Propietario propietario2 = new Propietario("Ana Gómez", "654321", "ana.gomez@example.com", "555-4321");

        // Crear algunos objetos VehiculoPasajero
        VehiculoPasajero vehiculo1 = new VehiculoPasajero("ABC123", "Modelo A", "Marca X", "Rojo", "Pequeño", propietario1, 4);
        VehiculoPasajero vehiculo2 = new VehiculoPasajero("XYZ789", "Modelo B", "Marca Y", "Azul", "Mediano", propietario2, 6);
        VehiculoPasajero vehiculo3 = new VehiculoPasajero("ABC123", "Modelo C", "Marca Z", "Verde", "Grande", propietario1, 5);

        // Agregar los vehículos a la empresa
        empresa.agregarVehiculoPasajero(vehiculo1);
        empresa.agregarVehiculoPasajero(vehiculo2);
        empresa.agregarVehiculoPasajero(vehiculo3);

        // Mostrar el total de pasajeros por placa
        empresa.mostrarTotalPasajerosPorPlaca();
    }
}
