package parcialFinal.adapter;

public class Adapter implements ICuadratracks {
    ICuadratrackElectrico obj;

    public Adapter(ICuadratrackElectrico obj) {
        this.obj = obj;
    }

    @Override
    public void llenarGasolina(int capacidad) {
        System.out.println("Adaptando llenar gasolina");
        obj.cargar(capacidad);
    }

    @Override
    public int estadoCombustible() {
        System.out.println("Adaptando estado combustible");
        int estado =obj.estadoDeElectricidad()*5;
        System.out.println("Nuevo estado del combustible: "+estado);
        return estado;
    }

}
