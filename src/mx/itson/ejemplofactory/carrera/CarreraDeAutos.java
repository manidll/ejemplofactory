/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ejemplofactory.carrera;

/**
 *
 * @author mane0
 */
public class CarreraDeAutos {
    public static void main(String[] args) {
        // Crear un auto de Fórmula 1 usando la fábrica de Fórmula 1
        FabricaAutosDeCarrera fabricaFormula1 = new FabricaFormula1();
        AutoDeCarrera autoFormula1 = fabricaFormula1.crearAutoDeCarrera();
        autoFormula1.acelerar();
        autoFormula1.frenar();

        // Crear un auto de rally usando la fábrica de rally
        FabricaAutosDeCarrera fabricaRally = new FabricaRally();
        AutoDeCarrera autoRally = fabricaRally.crearAutoDeCarrera();
        autoRally.acelerar();
        autoRally.frenar();
    }
}

    // Interfaz del producto
interface AutoDeCarrera {
    void acelerar();
    void frenar();
}

// Clases de productos concretas
class AutoFormula1 implements AutoDeCarrera {
    @Override
    public void acelerar() {
        System.out.println("Acelerando el auto de Fórmula 1");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el auto de Fórmula 1");
    }
}

class AutoRally implements AutoDeCarrera {
    @Override
    public void acelerar() {
        System.out.println("Acelerando el auto de rally");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el auto de rally");
    }
}

// Interfaz de la fábrica
interface FabricaAutosDeCarrera {
    AutoDeCarrera crearAutoDeCarrera();
}

// Implementaciones concretas de la fábrica
class FabricaFormula1 implements FabricaAutosDeCarrera {
    @Override
    public AutoDeCarrera crearAutoDeCarrera() {
        return new AutoFormula1();
    }
}

class FabricaRally implements FabricaAutosDeCarrera {
    @Override
    public AutoDeCarrera crearAutoDeCarrera() {
        return new AutoRally();
    }
}


    
