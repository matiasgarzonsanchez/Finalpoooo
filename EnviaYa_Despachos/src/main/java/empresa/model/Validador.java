package empresa.model;

public class Validador {

    public static void validarGuia(String guia) throws ExcepcionGuiaInvalida {
        if (guia == null) {
            throw new ExcepcionGuiaInvalida("La guia no puede estar vacia");
        }
    }


    public static void validarPeso(double peso, String guia) throws ExcepcionPesoInvalido {
        if (peso <= 0) {
            throw new ExcepcionPesoInvalido("debe pesar más de 0 , llevelo usted");
        }
        if (peso > 20) {
            throw new ExcepcionPesoInvalido("pesa más de 20 kg, busque otra empresa");
        }
    }
}
