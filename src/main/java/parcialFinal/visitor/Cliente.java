package parcialFinal.visitor;

public class Cliente {
    LaPaz laPaz= new LaPaz("La Paz",40,90000,"Templado",500);
    Cochabamba cochabamba= new Cochabamba("Cochabamba",18,50000, "calido",500);
    SantaCruz santaCruz= new SantaCruz("Santa Cruz", 20,70000, "Calido", 5000);

    ITurista turista= new Turista();

    laPaz.visitado(turista);
    cochabamba.visitado(turista);
    santaCruz.visitado(turista);

}
