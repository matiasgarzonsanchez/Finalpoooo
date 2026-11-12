package empresa.model;

public enum Zona {
    CENTRO(6000, 1),
    NORTE(8000, 2),
    SUR(8000, 3),
    ORIENTE(15000, 4);

    private final double tarifaBase;
    private final int ordenRuta;

    Zona(double tarifaBase, int ordenRuta) {
        this.tarifaBase = tarifaBase;
        this.ordenRuta = ordenRuta;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public int getOrdenRuta() {
        return ordenRuta;
    }
}
