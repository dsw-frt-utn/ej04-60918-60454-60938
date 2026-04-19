package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.VistaPrincipal;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        VistaPrincipal view = new VistaPrincipal();
        view.setVisible(true);
    }
}