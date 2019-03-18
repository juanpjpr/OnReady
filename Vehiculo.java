
package onready;

public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private float precio;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Vehiculo o) {
       if(this.getPrecio()<o.getPrecio())
           return 1;
         if(this.getPrecio()>o.getPrecio())
             return -1;
         return 0;
       
    }

   }
