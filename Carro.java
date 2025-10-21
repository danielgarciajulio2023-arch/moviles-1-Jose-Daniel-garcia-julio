public class Carro {
    private String marca;
    private int atributos;
    private String tipo;
    private String color;


public Carro(String marcacarro,int atributos, String tipocarro,String colorcarro){
    this.atributos=atributos;
    this.marca=marcacarro;
    this.tipo=tipocarro;
    this.color=colorcarro;
}

public void Marca(){
    System.out.println("Soy un "+marca+"! con "+atributos+" caballos de fuerza, soy de tipo "+tipo+"! y mi color es "+color+"!");
}

public static void main(String[] args){

    Carro carropequeño=new Carro("Supra", 2000, "Deportivo", "rojo");
    carropequeño.Marca();

}
}