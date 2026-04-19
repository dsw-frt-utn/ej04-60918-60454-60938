package data;

import domain.Responsable;
import domain.Sucursal;
import domain.Vehiculo;
import java.util.ArrayList;
import java.util.Optional;

public class Persistencia {
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private static ArrayList<Responsable> responsables = new ArrayList<>();
    private static ArrayList<Sucursal> sucursales = new ArrayList<>();

    private static void inicializarResponsables() {
        Responsable r1 = new Responsable("Carlos Gómez", "25444111", "3815551111");
        Responsable r2 = new Responsable("Laura Pérez", "30111222", "3815552222");

        responsables.add(r1);
        responsables.add(r2);
    }

    private static void inicializarSucursales() {
        Sucursal s1 = new Sucursal("SUC01", "Av. Belgrano 1200", "Tucumán", responsables.get(0));
        Sucursal s2 = new Sucursal("SUC02", "San Martín 450", "Yerba Buena", responsables.get(1));

        sucursales.add(s1);
        sucursales.add(s2);
    }

    public static void inicializar() {
        vehiculos.clear();
        responsables.clear();
        sucursales.clear();

        inicializarResponsables();
        inicializarSucursales();
    }

    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public static Optional<Vehiculo> getVehiculo(String patente) {
        return vehiculos.stream()
                .filter(v -> v.getPatente().equalsIgnoreCase(patente))
                .findFirst();
    }

    public static ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public static Optional<Sucursal> getSucursal(String codigo) {
        return sucursales.stream()
                .filter(s -> s.getCodigo().equalsIgnoreCase(codigo))
                .findFirst();
    }

    public static void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
}