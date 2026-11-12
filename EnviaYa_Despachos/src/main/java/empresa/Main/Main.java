package empresa.Main;

import empresa.model.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("primero");
        Despacho d1 = new Despacho("Andres");
        try {
            d1.agregarPaquete(new PaqueteEstandar("EY0001", 5, Zona.ORIENTE));
            d1.agregarPaquete(new PaqueteExpress("EY0002", 1.5, Zona.NORTE));
            d1.agregarPaquete(new PaqueteFragil("EY0003", 2, Zona.CENTRO, "vajilla"));
            d1.agregarPaquete(new PaqueteEstandar("EY0004", 8, Zona.CENTRO));
            d1.agregarPaquete(new PaqueteExpress("EY0005", 6, Zona.ORIENTE));
            d1.agregarPaquete(new PaqueteFragil("EY0006", 3.5, Zona.SUR, "televisor"));
            d1.imprimirManifiesto();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("segundo");
        try {
            System.out.println("PESO negativo");
            Paquete p1 = new PaqueteEstandar("EY00020", -2, Zona.CENTRO);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("paquete sin contenido");
            Paquete p2 = new PaqueteFragil("EY0007", 2, Zona.NORTE, "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.println("peso superior al prmirido por 1 moto");
            Paquete p4 = new PaqueteExpress("EY0008", 22, Zona.NORTE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("tercero");
        Despacho d2 = new Despacho("Camila");
        try {
            d2.agregarPaquete(new PaqueteEstandar("EY0009", 12, Zona.CENTRO));
            d2.agregarPaquete(new PaqueteExpress("EY00010", 10, Zona.SUR));

            try {
                d2.agregarPaquete(new PaqueteFragil("EY0012", 9, Zona.NORTE, "espejo"));
            } catch (ExcepcionCapacidadMotos e) {
                System.out.println(e.getMessage());
            }

            d2.agregarPaquete(new PaqueteEstandar("EY00013", 8, Zona.ORIENTE));

            d2.imprimirManifiesto();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        System.out.println("cuarto");
        Despacho d4 = new Despacho("Mateo");

        try {
            d4.agregarPaquete(new PaqueteFragil("EY0021", 3, Zona.SUR, "lampara"));
        } catch (Exception e) { System.out.println(e.getMessage()); }

        try {

            d4.agregarPaquete(new PaqueteEstandar("EY0022", 1, Zona.CENTRO));
        } catch (Exception e) { System.out.println(e.getMessage()); }

        try {
            d4.agregarPaquete(new PaqueteExpress("EY0023", 2, Zona.CENTRO));
        } catch (Exception e) { System.out.println(e.getMessage()); }

    }


}



