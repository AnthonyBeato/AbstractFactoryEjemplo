package org.example;

public class Cliente {
    private MueblesFactory fabrica;

    public Cliente(MueblesFactory fabrica) {
        this.fabrica = fabrica;
    }

    public void crearMuebles() {
        Silla silla = fabrica.crearSilla();
        Sofa sofa = fabrica.crearSofa();
        Mesa mesa = fabrica.crearMesa();

        silla.sentarse();
        sofa.recostarse();
        mesa.ponerObjetos();
    }
}
