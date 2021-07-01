package parcialFinal.visitor;

public interface ITurista {
    void visita(LaPaz laPaz);
    void visita(SantaCruz santaCruz);
    void visita(Cochabamba cochabamba);

    void showInfo();
}
