package parcialFinal.adapter;

import java.util.Random;

public class GasolinaEspecial implements ICuadratracks{
    int capacidad;


    @Override
    public void llenarGasolina(int capacidad) {
        this.capacidad=capacidad;
        System.out.println("Nueva cantidad de gasolina: "+this.capacidad);
    }

    @Override
    public int estadoCombustible() {
        Random rd = new Random();
        int numero = rd.nextInt(49)+1;
        System.out.println("Se tiene: ");
        System.out.println(numero+ "litros de gasolina especial");
        return numero;
    }

}
