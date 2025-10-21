public class Mascota{
//Declaro los atributos de la clase u objeto
private String nombre;
private String tipo;
private String color;

public Mascota(String nombredemimascota,String tipomascota,String colormascota){
 this.nombre=nombredemimascota;
 this.tipo=tipomascota;
 this.color=colormascota;
}

public void Saludar(){
    System.out.println("Hola, soy "+nombre+"! y soy de tipo: "+tipo+"! y soy de color "+color+"!");
}

//Creando herencia de la clase Mascota con extends
public class tipoanimalmascota extends Mascota {
    private String animal;

  public tipoanimalmascota ( String nombre,String tipo, String color,String raza){
    super(nombre,tipo,color);
    this.animal = animal;
    
    
  }

  public void  definirtipoanimal(){
    System.out.println("Soy un " + animal);  
  }  
} 


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
