/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ejemplofactory.videogame;

/**
 *
 * @author mane0
 */
public class Juego {
    public static void main(String[] args) {
        // Código principal
        FabricaPersonajes fabricaGuerreros = new FabricaGuerreros();
        Personaje guerrero = fabricaGuerreros.crearPersonaje();
        guerrero.atacar();
        guerrero.moverse();

        FabricaPersonajes fabricaMagos = new FabricaMagos();
        Personaje mago = fabricaMagos.crearPersonaje();
        mago.atacar();
        mago.moverse();
    }
}

    //Interfaz del personaje
interface Personaje {
    void atacar();
    void moverse();
}

//Interfaz de la fabrica
interface FabricaPersonajes {
    Personaje crearPersonaje();
}

class FabricaGuerreros implements FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new Guerrero();
    }
}

class FabricaMagos implements FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new Mago();
    }
}

//Clases de productos
class Guerrero implements Personaje {
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca con su espada");
    }

    @Override
    public void moverse() {
        System.out.println("El guerrero se desplaza por el campo de batalla");
    }
}

class Mago implements Personaje {
    @Override
    public void atacar() {
        System.out.println("El mago lanza un hechizo");
    }

    @Override
    public void moverse() {
        System.out.println("El mago se mueve con gracia utilizando su bastón");
    }
}
