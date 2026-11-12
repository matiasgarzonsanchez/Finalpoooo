package empresa.model;

public class PaqueteFragil extends Paquete  {
    
    private final String contenido;

    public PaqueteFragil(String guia, double peso, Zona zona, String contenido) throws ExcepcionGuiaInvalida, ExcepcionPesoInvalido, ExcepcionContenidoVacio {
        super(guia, peso, zona);
        if (contenido == null ) {
            throw new ExcepcionContenidoVacio( guia + "es frajil y debe decir que contiene");
        }
        this.contenido = contenido;
    }

    @Override
    public double calcularCosto() {
        return calcularCostoBase() + 5000;
    }

}
