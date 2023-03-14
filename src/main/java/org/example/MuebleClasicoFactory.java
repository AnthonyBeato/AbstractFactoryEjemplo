package org.example;

public class MuebleClasicoFactory implements MueblesFactory {
    public Silla crearSilla() {
        return new SillaClasica();
    }

    public Sofa crearSofa() {
        return new SofaClasico();
    }

    public Mesa crearMesa() {
        return new MesaClasica();
    }
}
