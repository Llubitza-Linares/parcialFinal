package parcialFinal.adapter;

public class Cliente {
    public static void main(String[] args) {
        ICuadratracks gasolina = new Gasolina();
        ICuadratracks diesel = new Diesel();
        ICuadratracks ge = new GasolinaEspecial();

        ICuadratracks ace = new Adapter(new CuadratrackElectrico());

        gasolina.estadoCombustible();
        gasolina.llenarGasolina(50);

        diesel.estadoCombustible();
        diesel.llenarGasolina(20);

        ge.estadoCombustible();
        ge.llenarGasolina(30);

        ace.estadoCombustible();
        ace.llenarGasolina(20);

    }
}
