package empresa.model;

public class PaqueteEstandar extends Paquete {

    public PaqueteEstandar(String guia, double peso, Zona zona) throws ExcepcionGuiaInvalida, ExcepcionPesoInvalido {
        super(guia, peso, zona);
    }

    @Override
    public double calcularCosto() {
        return calcularCostoBase();
    }


}
