package org.example;

public class MuebleModernoFactory implements MueblesFactory {
    public Silla crearSilla() {
        return new SillaModerna();
    }

    public Sofa crearSofa() {
        return new SofaModerno();
    }

    public Mesa crearMesa() {
        return new MesaModerna();
    }
}
