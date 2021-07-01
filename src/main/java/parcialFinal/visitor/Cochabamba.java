package parcialFinal.visitor;

public class Cochabamba {
    String nombre;
    int numeroProvincias;
    int numeroHabitantes;
    String clima;
    double dineroTurismo;

    public Cochabamba(String nombre, int numeroProvincias, int numeroHabitantes,String clima, double dineroTurismo){
        this.nombre="Cochabamba";
        this.numeroProvincias= numeroProvincias;
        this.numeroHabitantes=numeroHabitantes;
        this.clima=clima;
        this.dineroTurismo=dineroTurismo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroProvincias() {
        return numeroProvincias;
    }

    public void setNumeroProvincias(int numeroProvincias) {
        this.numeroProvincias = numeroProvincias;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public double getDineroTurismo() {
        return dineroTurismo;
    }

    public void setDineroTurismo(double dineroTurismo) {
        this.dineroTurismo = dineroTurismo;
    }

    public void visitado(ITurista turista){
        turista.visita(this);
    }
}
