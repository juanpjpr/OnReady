package onready;

import java.util.ArrayList;
import java.util.Collections;

public class OnReady {

    static ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();

    public static void main(String[] args) {

        cargar();
        mostrar();
        System.out.println(masCaro());
        System.out.println(masBarato());
        contiene("Y");
        ordenar();
    }

    public static void cargar() {
        Auto nuevo = new Auto("Peugeot", "206", 4, 200000);
        Moto nuevo2 = new Moto("Honda", "Titan", 125, 60000);
        Auto nuevo3 = new Auto("Peugeot", "208", 5, 250000);
        Moto nuevo4 = new Moto("Yamaha", "YBR", 160, 80500);

        listado.add(nuevo);
        listado.add(nuevo2);
        listado.add(nuevo3);
        listado.add(nuevo4);

    }

    public static void mostrar() {
        for (Vehiculo vehi : listado) {
            System.out.println(vehi.toString());
        }
        System.out.println("==============================");
    }

    public static String masCaro() {
        String respuesta = "";
        float mayor = 0;
        for (Vehiculo vehi : listado) {
            if (vehi.getPrecio() > mayor) {
                mayor = vehi.getPrecio();
                respuesta = "Vehículo más caro: " + vehi.getMarca() + " " + vehi.getModelo();
            }
        }
        return respuesta;
    }

    public static String masBarato() {
        String respuesta = "";
        float menor = 0;
        for (Vehiculo vehi : listado) {
            if (menor == 0) {
                menor = vehi.getPrecio();
            }
            if (vehi.getPrecio() < menor) {
                menor = vehi.getPrecio();
                respuesta = "Vehículo más barato: " + vehi.getMarca() + " " + vehi.getModelo();
            }
        }
        return respuesta;
    }

    public static void contiene(String letra) {
        String item = "";
        for (Vehiculo vehi : listado) {
            item = vehi.getModelo();
            if (item.contains(letra)) {
                System.out.println("Vehículo que contiene en el modelo la letra ‘" + letra + "’: " + vehi.getMarca() + " " + vehi.getModelo() + " $" + vehi.getPrecio());
            }
        }
    }

    public static void ordenar() {
        Collections.sort(listado);
         System.out.println("==============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (Vehiculo vehi : listado) {
            System.out.println(vehi.toString());
        }
    }
}
