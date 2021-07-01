package parcialFinal.proxy;

import java.util.LinkedList;
import java.util.List;

public class Proxy implements ILogin{
    List<Usuarios> usuarios;
    ILogin servidor1;
    ILogin servidor2;
    int numeroUsuarios;

    public Proxy(ILogin servidor1, ILogin servidor2) {
        usuarios = new LinkedList<Usuarios>();
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
        numeroUsuarios = 0;
    }

    public void registrar(String usuario, String contrasena) {
        numeroUsuarios++;
        usuarios.add(new Usuarios(numeroUsuarios, usuario, contrasena));
    }

    @Override
    public void ingresar(String usuario, String password) {
        for (Usuarios usuarios : usuarios) {
            if (usuarios.getUsuario().equals(usuario)) {
                if (usuarios.getContrasena().equals(password)) {
                    if (usuarios.id % 2 == 0) {
                        System.out.println("El servidor 2 se encuentra ocupado");
                        servidor2.ingresar(usuario, password);
                    } else {
                        System.out.println("El servidor 1 se encuentra ocupado");
                        servidor1.ingresar(usuario, password);
                    }
                } else {
                    System.out.println("La contraseña es incorrecta");
                }
            }
        }
    }

    public boolean esPrimo(int n) {
        if(n==2) {
            return true;
        }
        for(int i = 2; i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
