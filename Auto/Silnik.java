package Auto;

public class Silnik {
    private String typSilnika = "benzynowy";
    private double pojemnoscSilnika = 1.4;
    private int spalanie = 5; //5 litrow na 100 km
    private boolean poziomOleju = true;



    public Silnik(String typSilnika, double mocSilnika, int spalanie,boolean poziomOleju) {
        this.typSilnika = typSilnika;
        this.pojemnoscSilnika = mocSilnika;
        this.spalanie = spalanie;
        this.poziomOleju = poziomOleju;
    }

    public String getTypSilnika() {
        return typSilnika;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public int getSpalanie() {
        return spalanie;
    }

    public boolean isPoziomOleju() {
        return poziomOleju;
    }
}


