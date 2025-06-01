
public class WantedCard {


    private String kartenListenName ;
    private int kartenAnzahl ;
    

    public WantedCard(String kartenListenName , int kartenAnzahl){
        this.kartenListenName = kartenListenName;
        this.kartenAnzahl = kartenAnzahl;
    }

    public String getKartenListenName() {
        return kartenListenName;
    }

    public int getKartenAnzahl() {
        return kartenAnzahl;
    }

    public void setKartenName(String kartenListenName) {
        this.kartenListenName = kartenListenName;
    }

    public void setKartenAnzahl(int kartenAnzahl) {
        this.kartenAnzahl = kartenAnzahl;
    }
    
    

}
