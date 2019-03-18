
package onready;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo, int puertas, float precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
    
    @Override
     public String toString(){
       return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + getPuertas() + " // Precio: $" + getPrecio();
   }
   
}
