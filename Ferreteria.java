public class Ferreteria {
    // Atributos (10 atributos)
    public String nombre;
    private String codigo;
    private double precio;
    private int stock;
    private String producto;
    private String marca;
    private String categoria;
    private String proveedor;
    private String ubicacion;
    private boolean disponible;

    // Constructor
    public Ferreteria(String nombre, String codigo, double precio, int stock, String producto,
                      String marca, String categoria, String proveedor, String ubicacion, boolean disponible) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.producto = producto;
        this.marca = marca;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.ubicacion = ubicacion;
        this.disponible = disponible;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Codigo: " + codigo + " | Precio: $" + precio + 
                           " | Stock: " + stock + " | Marca: " + marca + " | Ubicacion: " + ubicacion);
    }

    // Subclase HerramientaElectrica
    public static class HerramientaElectrica extends Ferreteria {
        private int potencia;
        private String alimentacion;

        public HerramientaElectrica(String nombre, String codigo, double precio, int stock, String producto,
                                    String marca, String categoria, String proveedor, String ubicacion, 
                                    boolean disponible, int potencia, String alimentacion) {
            super(nombre, codigo, precio, stock, producto, marca, categoria, proveedor, ubicacion, disponible);
            this.potencia = potencia;
            this.alimentacion = alimentacion;
        }

        public void mostrarEspecificaciones() {
            System.out.println("Herramienta electrica de " + potencia + "W con alimentacion " + alimentacion);
        }
        
        @Override
        public void mostrarInfo() {
            System.out.println("HERRAMIENTA ELECTRICA: " + nombre + "  Potencia: " + potencia + 
                               "W  Precio: $" + " +       Stock: " ); 
        }
    }

    // Subclase MaterialConstruccion (polimorfismo)
    public static class MaterialConstruccion extends Ferreteria {
        private double peso;
        private String unidadMedida;

        public MaterialConstruccion(String nombre, String codigo, double precio, int stock, String producto,
                                    String marca, String categoria, String proveedor, String ubicacion,
                                    boolean disponible, double peso, String unidadMedida) {
            super(nombre, codigo, precio, stock, producto, marca, categoria, proveedor, ubicacion, disponible);
            this.peso = peso;
            this.unidadMedida = unidadMedida;
        }

        @Override
        public void mostrarInfo() {
            System.out.println("MATERIAL DE CONSTRUCCION: " + nombre + " | Peso: " + peso + 
                               "kg | Unidad: " + unidadMedida + " | Precio: $" );
        }
    }

    // Metodo main
    public static void main(String[] args) {
        
        // Crear instancia de la clase Ferreteria
        Ferreteria producto1 = new Ferreteria("Martillo Stanley", "F001", 25000, 50, "Herramienta Manual",
                                               "Stanley", "Herramientas", "Distribuidora XYZ", "Estante A12", true);
        producto1.mostrarInfo();

        // Otra instancia
        Ferreteria producto2 = new Ferreteria("Cinta Metrica", "F002", 15000, 100, "Instrumento Medicion",
                                               "Truper", "Medicion", "Importadora ABC", "Estante B05", true);
        producto2.mostrarInfo();
        System.out.println();

        // Instancia de la subclase HerramientaElectrica
        HerramientaElectrica taladro = new HerramientaElectrica("Taladro Bosch", "HE001", 180000, 25, 
                                                                 "Herramienta Electrica", "Bosch", "Electrica",
                                                                 "Bosch Colombia", "Estante C08", true, 750, "110V");
        taladro.mostrarInfo();
        taladro.mostrarEspecificaciones();
        System.out.println();

        // Instancia de la subclase MaterialConstruccion (polimorfismo)
        MaterialConstruccion cemento = new MaterialConstruccion("Cemento Gris", "MC001", 32000, 200,
                                                                 "Material Construccion", "Argos", "Construccion",
                                                                 "Cementos Argos", "Bodega 1", true, 50.0, "Bultos");
        cemento.mostrarInfo();
     
    }
}

