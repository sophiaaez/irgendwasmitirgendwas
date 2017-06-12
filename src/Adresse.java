/**
 * Created by monaw on 10.04.2017.
 */
public class Adresse {
    private String strasse;
    private int hausnummer;
    private long postleitzahl;
    private String stadt;
    private String land;
    private long telefonnummer;

    public Adresse(String strasse, int hausnummer, long postleitzahl, String stadt, String land, long telefonnummer) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.stadt = stadt;
        this.land = land;
        this.telefonnummer = telefonnummer;
    }

    public void setTelefonnummer(long telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public long getPostleitzahl() {
        return postleitzahl;
    }

    public String getStadt() {
        return stadt;
    }

    public String getLand() {
        return land;
    }

    public long getTelefonnummer() {
        return telefonnummer;
    }
}
