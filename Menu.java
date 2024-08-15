import java.util.Scanner;

public class Menu {
    private static Empresa empresa = new Empresa("Transporte XYZ");
    private static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenu() {
        System.out.println("=== Menú de Opciones ===");
        System.out.println("1. Agregar Usuario");
        System.out.println("2. Agregar Vehículo Pasajero");
        System.out.println("3. Mostrar Total de Pasajeros por Placa");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static int obtenerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor ingrese un número.");
            scanner.next(); // Limpiar el buffer
        }
        return scanner.nextInt();
    }

    public static void agregarUsuario() {
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el ID del usuario: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese el email del usuario: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese el celular del usuario: ");
        String celular = scanner.nextLine();

        Propietario propietario = new Propietario(nombre, id, email, celular);
        System.out.println("Usuario agregado: " + propietario);
        // Agregar el usuario a una colección si es necesario
    }

    public static void agregarVehiculoPasajero() {
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el color del vehículo: ");
        String color = scanner.nextLine();
        System.out.print("Ingrese el tamaño del vehículo: ");
        String tamano = scanner.nextLine();

        System.out.print("Ingrese el nombre del usuario asociado: ");
        String nombreUsuario = scanner.nextLine();
        Propietario propietario = buscarUsuarioPorNombre(nombreUsuario);

        if (propietario == null) {
            System.out.println("Usuario no encontrado. Debe agregar el usuario antes.");
            return;
        }

        System.out.print("Ingrese el número máximo de pasajeros: ");
        int numeroMaxPasajeros = scanner.nextInt();

        VehiculoPasajero vehiculo = new VehiculoPasajero(placa, modelo, marca, color, tamano, propietario, numeroMaxPasajeros);
        empresa.agregarVehiculoPasajero(vehiculo);
        System.out.println("Vehículo agregado: " + vehiculo);
    }

    private static Propietario buscarUsuarioPorNombre(String nombre) {
        // Implementa la búsqueda real aquí si se mantiene una colección de usuarios
        // En este ejemplo, se crea un usuario ficticio
        return new Propietario(nombre, "000000", "email@example.com", "000-0000");
    }

    public static void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = obtenerOpcion();

            switch (opcion) {
                case 1:
                    agregarUsuario();
                    break;
                case 2:
                    agregarVehiculoPasajero();
                    break;
                case 3:
                    empresa.mostrarTotalPasajerosPorPlaca();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese una opción válida.");
            }
        }

        scanner.close();
    }
}
