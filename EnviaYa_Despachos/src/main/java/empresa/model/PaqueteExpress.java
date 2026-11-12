package empresa.model;

public class PaqueteExpress extends Paquete {

    public PaqueteExpress(String guia, double peso, Zona zona) throws ExcepcionGuiaInvalida, ExcepcionPesoInvalido {
        super(guia, peso, zona);
    }

    @Override
    public double calcularCosto() {
        double base = calcularCostoBase();
        return base + (base * 0.50);
    }


}
