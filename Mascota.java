public class Mascota{ // Siempre lleva el nombre del archivo y public porque no reterna datos
    // 1 Declaro los articulos de la clase u objeto
    private String nombre; // letras
    private String tipo;
    private String color;

    //constructor
    public Mascota(String nombredemimascota,String tipomascota,String edadmascota,  String colordemimascota){ // entre parentesis van los atributos
        this.nombre=nombredemimascota;
        this.tipo=tipomascota;
        this.color=colordemimascota;
        //Realizar e imprimir el atributo color 

    }

    //Creo mi primer Metodo
public void Saludar(){
    System.out.println("Hola, soy"+nombre+"! y soy de tipo"+tipo+"! y soy de negro"+color+"!");

}

public static void main(String[] args) {

    Mascota mascotahija=new Mascota("Cronos", "Pastor_Aleman", "negro");
    mascotahija.Saludar();
 }

}
