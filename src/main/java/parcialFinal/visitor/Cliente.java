package parcialFinal.visitor;

public class Cliente {
    public static void main(String[] args) {
        LaPaz laPaz= new LaPaz(40,90000,"Templado",500);
        Cochabamba cochabamba= new Cochabamba(18,50000, "calido",500);
        SantaCruz santaCruz= new SantaCruz(20,70000, "Calido", 5000);

        ITurista turista= new Turista("Maria", 47447,48757);

        laPaz.visitado(turista);
        cochabamba.visitado(turista);
        santaCruz.visitado(turista);
    }
}
