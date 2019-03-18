
package onready;


public class Moto extends Vehiculo{
    private int cilin;

    public void setCilin(int cilin) {
        this.cilin = cilin;
    }

    public int getCilin() {
        return cilin;
    }

    public Moto( String marca, String modelo, int cilin, float precio) {
        super(marca, modelo, precio);
        this.cilin = cilin;
    }
    
    @Override
     public String toString(){
       return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: "+ getCilin() + "c // Precio: " + getPrecio();
   }
}
