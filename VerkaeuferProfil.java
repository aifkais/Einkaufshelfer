import java.util.ArrayList;
public class VerkaeuferProfil {


    private String verkaeuferName ;
    private double durchschnittsPreis ;
    private ArrayList<ArrayList<Double>> preisListe;

    public VerkaeuferProfil(String verkaeuferName,double durchschnittsPreis, ArrayList<ArrayList<Double>> preisListe) {
        this.verkaeuferName = verkaeuferName;
        this.durchschnittsPreis = durchschnittsPreis;
        this.preisListe = preisListe;

    }

    public String getVerkaeuferName() {
        return verkaeuferName;
    }

    public double getDurchschnittsPreis() {
        return durchschnittsPreis;
    }

    public ArrayList<ArrayList<Double>> getPreisListe() {
        return preisListe;
    }

    public void setVerkaeuferName(String verkaeuferName) {
        this.verkaeuferName = verkaeuferName;
    }

    public void setDurchschnittsPreis(double durchschnittsPreis) {
        this.durchschnittsPreis = durchschnittsPreis;
    }

    public void setPreisListe(ArrayList<ArrayList<Double>> preisListe) {
        this.preisListe = preisListe;
    }


    


}
