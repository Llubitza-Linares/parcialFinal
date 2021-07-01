package parcialFinal.adapter;

import java.util.Random;

public class CuadratrackElectrico implements ICuadratrackElectrico{
    int capacidad;

    @Override
    public void cargar(int capacidad) {
        this.capacidad=capacidad;
        System.out.println("Nueva capacidad cuadratrack eléctrico: "+this.capacidad);

    }

    @Override
    public int estadoDeElectricidad() {
        Random rd = new Random();
        int numero = rd.nextInt(9)+1;
        System.out.println("Estado de electricidad de Cuadratrack eléctrico: ");
        System.out.println(numero);
        return numero;
    }
}
