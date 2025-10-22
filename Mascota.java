public class Mascota { // siempre lleva el nombre del archivo
    // Declaro los atributos de la clase u objeto//
    public String nombre; // String es para poder agregar letras
    private String tipo;
    private String color;

    // Constructor
    public Mascota(String nombreDeMiMascota, String tipomascota, String Colormascota) {
        this.nombre = nombreDeMiMascota;
        this.tipo = tipomascota;
        this.color = Colormascota;
    }

    // Creo mi primer método
    public void saludar() {
        System.out.println("Hola, soy " + nombre + "! y soy de tipo: " + tipo + "! y soy de color " + color + "!");
    }

    // Creando herencia de la clase mascota (solo hereda los datos que ya se crearon en el anterior)
    public static class Tipoanimalmascota extends Mascota {
        private String animal;

            // Constructor para la super clase Tipoanimalmascota
            public Tipoanimalmascota(String nombre, String tipo, String color, String animal) {
                super(nombre, tipo, color);
                this.animal = animal;
            }

        // Método de la super clase
        public void definirtipoanimal() {
            System.out.println("Soy un " + animal);
        }
    }



    //hacemos polimorfisno de la clase mascota a mascota policia (transforma)
    public static class MascotaPolicia extends Mascota {

        private String Especialidad;
        public MascotaPolicia(String nombre, String tipo, String color, String Especialidad){
            super(nombre, tipo, color);
            this.Especialidad=Especialidad;


            
        }
        //@overtide sigifica que empezamos a hacer el polimorfismo de la clase saludar 
        @Override
        //creamos el metodo de la super clase con polimorfismo 
        public void saludar(){
            System.out.println("Alto soy "+ nombre +" Mi especialidad es " + Especialidad);
        }
    
}
    // clase main para poder 
    public static void main(String[] args) {
        // Crear instancia de la clase Mascota
        Mascota mascotahija = new Mascota("Kronos", "Pastor Alemán", "Dorado");
        mascotahija.saludar();

        // Crear otra instancia de la clase Mascota
        Mascota mimascota = new Mascota("Golden", "Golden Retriever", "Dorado");
        mimascota.saludar();

        // Crear instancia de la clase Tipoanimalmascota
        Tipoanimalmascota mascotaconraza = new Tipoanimalmascota("Nala", "Bichon martes", "Blanco", "Perra");
        mascotaconraza.saludar();
        mascotaconraza.definirtipoanimal();

        MascotaPolicia MascotaVigilante = new MascotaPolicia("rex","belga_malinois", "marron","antiNarcotios");
        MascotaVigilante.saludar();
    }
}