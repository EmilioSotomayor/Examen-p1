import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Sistema de Registro de Hotel ---");
        System.out.print("Ingrese nombre del usuario: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese número de identificación: ");
        String id = sc.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();

        System.out.print("Tipo de habitación (sencilla, doble, suite): ");
        String tipo = sc.nextLine().toLowerCase();
        System.out.print("Número de habitaciones que necesita: ");
        int cantidad = sc.nextInt();
        if (tipo.equals("suite") && cantidad > 2) {
            System.out.println("\nError: Solo hay 2 suites disponibles. Registro cancelado.");
        } else {

            HotelRegistro registro = new HotelRegistro(nombre, id, edad, tipo, cantidad);

            if (!registro.esMayorDeEdad()) {
                System.out.println("Nota: El usuario es menor de edad.");
            }
            registro.mostrarDatos();
        }
        sc.close();
    }
}
