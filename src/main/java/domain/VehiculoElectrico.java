package domain;

public class VehiculoElectrico extends Vehiculo {
    private double kwhBase;

    public VehiculoElectrico(String patente, Marca marca, String modelo, int anio, double capacidadCarga,
                             Sucursal sucursal, double kwhBase) {
        super(VehiculoTipo.ELECTRICO, patente, marca, modelo, anio, capacidadCarga, sucursal);
        this.kwhBase = kwhBase;
    }

    public double getKwhBase() {
        return kwhBase;
    }

    @Override
    public double calcularConsumo(double kilometros) {
        if (kilometros <= 0) {
            return 0;
        }

        double total = (kilometros / 100.0) * kwhBase;

        if (capacidadCarga > 1200) {
            total = total * 1.15;
        }

        return total;
    }
}