package Auto;

public class Kola {
    private double rozmiarKola;
    private String typOpony;
    private String nazwa;

    public Kola(int rozmiarKola, String typOpony, String nazwa) {
        this.rozmiarKola = rozmiarKola;
        this.typOpony = typOpony;
        this.nazwa = nazwa;

    }

    public String getNazwa() {
        return nazwa;
    }

    public double getRozmiarKola() {
        return rozmiarKola;
    }

    public String getTypOpony() {
        return typOpony;
    }

}






