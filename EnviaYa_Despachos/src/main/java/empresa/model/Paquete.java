package empresa.model;

import java.util.Objects;

public abstract class Paquete {
    protected final String guia;
    protected final double peso;
    protected final Zona zona;

    public Paquete(String guia, double peso, Zona zona) throws ExcepcionGuiaInvalida, ExcepcionPesoInvalido {
        Validador.validarGuia(guia);
        Validador.validarPeso(peso, guia);
        
        this.guia = guia;
        this.peso = peso;
        this.zona = zona;
    }

    public String getGuia() {
        return guia;
    }

    public double getPeso() {
        return peso;
    }

    public Zona getZona() {
        return zona;
    }


    public double calcularCostoBase() {
        return zona.getTarifaBase() + (1000 * peso);
    }


    public abstract double calcularCosto();


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paquete paquete = (Paquete) o;
        return Double.compare(peso, paquete.peso) == 0 && Objects.equals(guia, paquete.guia) && zona == paquete.zona;
    }

    @Override
    public int hashCode() {
        return Objects.hash(guia, peso, zona);
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "guia='" + guia + '\'' +
                ", peso=" + peso +
                ", zona=" + zona +
                '}';
    }
}
