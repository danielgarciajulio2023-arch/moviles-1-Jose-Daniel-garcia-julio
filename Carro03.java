public class Carro03 {
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private String color;
    private double capacidadCarga; // en toneladas
    private String tipoCombustible;
    private int numeroEjes;
    private double kilometraje;
    private double precio;
    private String estado; // "nuevo", "usado", "mantenimiento"

    public Carro03(String marca, String modelo, int añoFabricacion, String color,double capacidadCarga, String tipoCombustible, int numeroEjes,double kilometraje, double precio, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.color = color;
        this.capacidadCarga = capacidadCarga;
        this.tipoCombustible = tipoCombustible;
        this.numeroEjes = numeroEjes;
        this.kilometraje = kilometraje;
        this.precio = precio;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de Fabricación: " + añoFabricacion);
        System.out.println("Color: " + color);
        System.out.println("Capacidad de Carga: " + capacidadCarga + " toneladas");
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Número de Ejes: " + numeroEjes);
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Precio: $" + precio);
        System.out.println("Estado: " + estado);
    }

    public double calcularDepreciacion() {
        int añoActual = 2025;
        int edad = añoActual - añoFabricacion;
        double depreciacion = (edad * 0.05 + kilometraje / 100000 * 0.10) * precio;
        return depreciacion;
    }

    public void verificarMantenimiento() {
        if (kilometraje > 100000) {
            System.out.println(" Recomendación: Este vehículo necesita mantenimiento.");
        } else {
            System.out.println(" El vehículo no requiere mantenimiento por ahora.");
        }
    }

    public void aplicarDescuento() {
        double descuento = 0;

        if (estado.equalsIgnoreCase("usado")) {
            descuento += 0.10; // 10% por ser usado
        } else if (estado.equalsIgnoreCase("mantenimiento")) {
            descuento += 0.15; // 15% por estar en mantenimiento
        }

        int añoActual = 2025;
        int edad = añoActual - añoFabricacion;
        if (edad > 5) {
            descuento += 0.05; // 5% adicional si tiene más de 5 años
        }

        double precioFinal = precio * (1 - descuento);
        System.out.println(" Precio con descuento aplicado: $" + precioFinal);
    }

    public static void main(String[] args) {
        Carro03 miCarro = new Carro03("mustan", "ford", 2025, "azul", 1.5,
                                  "Diesel", 5, 110000, 4000, "Deportivo");

        miCarro.mostrarInformacion();
        System.out.println("Depreciación estimada: $" + miCarro.calcularDepreciacion());
        miCarro.verificarMantenimiento();
        miCarro.aplicarDescuento();
    }
}