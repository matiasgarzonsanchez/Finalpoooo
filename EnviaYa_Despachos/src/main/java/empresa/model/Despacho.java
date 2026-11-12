package empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Despacho {
    private static int contadorDespachos = 1;
    
    private String codigo;
    private String mensajero;
    private List<Paquete> paquetes;

    public Despacho(String mensajero) {
        this.codigo = "D-" + contadorDespachos;
        contadorDespachos++;
        this.mensajero = mensajero;
        this.paquetes = new ArrayList<>();
    }

    public void agregarPaquete(Paquete paquete) throws ExcepcionPaqueteDuplicado, ExcepcionCapacidadMotos {

        for (int i = 0; i < paquetes.size(); i++) {
            if (paquetes.get(i).equals(paquete)) {
                throw new ExcepcionPaqueteDuplicado(  paquete.getGuia() + " ya está en este despacho.");
            }
        }


        double pesoTotal = 0;
        for (int i = 0; i < paquetes.size(); i++) {
            pesoTotal += paquetes.get(i).getPeso();
        }

        if (pesoTotal + paquete.getPeso() > 30.0) {
            throw new ExcepcionCapacidadMotos( paquete.getGuia() + " excede los 30 kg permitidos.");
        }

        paquetes.add(paquete);
    }

    public void imprimirManifiesto() {
        System.out.println("numero de despacho " + codigo + "mensajero" + mensajero);


        double costoDespacho = 0;
        double pesoDespacho = 0;
        List<String> advertencias = new ArrayList<>();

        for (int i = 0; i < paquetes.size(); i++) {
            Paquete p = paquetes.get(i);
            costoDespacho += p.calcularCosto();
            pesoDespacho += p.getPeso() ;
        }



    }
}
