public class HotelRegistro {
    private String nombre;
    private String identificacion;
    private int edad;
    private String tipoHabitacion;
    private int cantidadHabitaciones;
    private String numeroRegistro;
    private double costoTotal;
    private final double PRECIO_SENCILLA = 40.0;
    private final double PRECIO_DOBLE = 60.0;
    private final double PRECIO_SUITE = 80.0;
    public HotelRegistro(String nombre, String identificacion, int edad, String tipoHabitacion, int cantidadHabitaciones) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.tipoHabitacion = tipoHabitacion.toLowerCase();
        this.cantidadHabitaciones = cantidadHabitaciones;
        generarNumeroRegistro();
        calcularCosto();
    }
    private void generarNumeroRegistro() {
        if (identificacion.length() >= 4) {
            this.numeroRegistro = identificacion.substring(identificacion.length() - 4);
        } else {
            this.numeroRegistro = identificacion;
        }
    }
    private void calcularCosto() {
        double precioBase = 0;
        switch (tipoHabitacion) {
            case "sencilla": precioBase = PRECIO_SENCILLA; break;
            case "doble": precioBase = PRECIO_DOBLE; break;
            case "suite": precioBase = PRECIO_SUITE; break;
        }
        this.costoTotal = precioBase * cantidadHabitaciones;
    }
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
    public void mostrarDatos() {
        System.out.println("\n--- Resumen del Registro ---");
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Edad: " + edad + (esMayorDeEdad() ? " (Mayor de edad)" : " (Menor de edad)"));
        System.out.println("Tipo de habitación: " + tipoHabitacion);
        System.out.println("Cantidad: " + cantidadHabitaciones);
        System.out.println("Total a pagar: $" + costoTotal);

    }
}
