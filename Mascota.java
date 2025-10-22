//la clase lleva un nombre publico al nombre del archivo en igual al nombre de la clase
public class Mascota{
//1.Atributos cuantos?...o hay limite los que necesite mi proyecto en este case 3

private String nombre;
private String tipo;
private String color;

//constructor, la maquina
public Mascota(String nombredemimascota,String tipomascota,String colormascota){
 this.nombre=nombredemimascota;
 this.tipo=tipomascota;
 this.color=colormascota;
}
//3.funciones de trabajo del objeto
public void Saludar(){
    System.out.println("Hola, soy "+nombre+"! y soy de tipo: "+tipo+"! y soy de color "+color+"!");
}

//Creando herencia de la clase Mascota con extends
//clase hija interna (clase para crear otra y heredar atributos,superclase)
public class tipoanimalmascota extends Mascota {
    private String animal;

    //constructor de superclase
  public tipoanimalmascota ( String nombre,String tipo, String color,String raza){
    super(nombre,tipo,color);
    this.animal = animal;
    
    
  }

   //Metodo de superclase
  public void  definirtipoanimal(){
    System.out.println("Soy un " + animal);  
  }  
} 

//
public static void main(String[] args){
    Mascota MascotaHija=new Mascota("Nala","bichon martes","blanca");//llamo al constructor
    MascotaHija.Saludar();
    
   //Creando segundo objeto de Mascota se llamara Mimascota
   Mascota Mimascota= new Mascota("Nala", "bichon martes", "blanca");
   Mimascota.Saludar();

   // Para usar la clase hija interna
   tipoanimalmascota mascotaConRaza = new Tipoanimalmascota("Nala", "bichon martes", "blanca", "perro");
   mascotaConRaza.Saludar();
   mascotaConRaza.definirtipoanimal();
  }

}
