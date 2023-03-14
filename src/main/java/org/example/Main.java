package org.example;

public class Main {
    public static void main(String[] args) {
        MueblesFactory fabricaClasica = new MuebleClasicoFactory();
        MueblesFactory fabricaModerna = new MuebleModernoFactory();

        Cliente cliente1 = new Cliente(fabricaClasica);
        cliente1.crearMuebles();

        Cliente cliente2 = new Cliente(fabricaModerna);
        cliente2.crearMuebles();

    }
}