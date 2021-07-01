package parcialFinal.visitor;

public interface ITurista {
    void visita(LaPaz laPaz);
    void visita (Cochabamba cochabamba);
    void visita (SantaCruz santaCruz);

    void showInfo();
}
