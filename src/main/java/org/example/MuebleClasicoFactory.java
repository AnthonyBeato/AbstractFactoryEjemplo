package org.example;

public class MuebleClásicoFactory implements MueblesFactory {
    public Silla crearSilla() {
        return new SillaClásica();
    }

    public Sofa crearSofa() {
        return new SofaClásico();
    }

    public Mesa crearMesa() {
        return new MesaClásica();
    }
}
