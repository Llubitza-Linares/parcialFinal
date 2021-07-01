package parcialFinal.visitor;

import java.util.Random;

public class Turista implements ITurista{
    private String nombre;
    private double dinero;
    private int ci;

    @Override
    public void visita(LaPaz laPaz) {
        System.out.println("Me encuentro visitando La Paz");
        Random random=new Random();
        double gasto=dinero*random.nextDouble();
        System.out.println("El dinero que se gasto fue: ");
        System.out.println(dinero);
        dinero-=gasto;
        this.showInfo();
    }

    @Override
    public void visita(Cochabamba cochabamba) {
        System.out.println("Me encuentro visitando Cochabamba");
        double gasto=(cochabamba.getNumeroHabitantes()*0.1);
        System.out.println("El dinero que se gasto fue: ");
        System.out.println(dinero);
        dinero-=gasto;
        this.showInfo();
    }

    @Override
    public void visita(SantaCruz santaCruz) {
        System.out.println("Me encuentro visitando Santa Cruz");
        double gasto=(santaCruz.getNumeroProvincias()*0.5);
        System.out.println("El dinero que se gasto fue: ");
        System.out.println(dinero);
        dinero-=gasto;
        this.showInfo();
    }

    @Override
    public void showInfo() {

        System.out.println("********Info Turista");
        System.out.println("El nombre del turista es"+ nombre);
        System.out.println("El Ci del turista es"+ci);
        System.out.println("El monto de dinero es"+dinero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
