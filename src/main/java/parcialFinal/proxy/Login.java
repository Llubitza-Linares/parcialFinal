package parcialFinal.proxy;

public class Login implements ILogin{
    @Override
    public void ingresar(String usuario, String password) {
        System.out.println("Se está atendiendo al usuario: " + usuario);
    }
}
