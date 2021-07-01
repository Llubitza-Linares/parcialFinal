package parcialFinal.proxy;

public class Cliente {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Login(), new Login());

        proxy.registrar("Alejandra", "123789");
        proxy.registrar("Adriana", "456123");
        proxy.registrar("Maria", "789456");
        proxy.registrar("Lucia", "147258");
        proxy.registrar("Andrea", "258369");
        proxy.registrar("Carlos", "369147");

        proxy.ingresar("Alejandra", "123789");

        proxy.ingresar("Alejandra", "123789");
        proxy.ingresar("Adriana", "456123");
        proxy.ingresar("Maria", "789456");
        proxy.ingresar("Lucia", "147258");
        proxy.ingresar("Andrea", "258369");
        proxy.ingresar("Carlos", "369147");

    }
}
