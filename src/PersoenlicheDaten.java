/**
 * Created by monaw on 10.04.2017.
 */
public class PersoenlicheDaten {
    private Adresse adresse;
    private Kontodaten kontodaten;
    private String vorname;
    private String nachname;
    private String emailadresse;
    private String benutzername;

    public PersoenlicheDaten(Adresse adresse, Kontodaten kontodaten, String vorname, String nachname, String emailadresse, String benutzername) {
        this.adresse = adresse;
        this.kontodaten = kontodaten;
        this.vorname = vorname;
        this.nachname = nachname;
        this.emailadresse = emailadresse;
        this.benutzername = benutzername;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setTelefonnummer(long telefonnummer){
        this.adresse.setTelefonnummer(telefonnummer);
    }

    public Kontodaten getKontodaten() {
        return kontodaten;
    }

    public void setKontodaten(Kontodaten kontodaten) {
        this.kontodaten = kontodaten;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getEmailadresse() {
        return emailadresse;
    }

    public void setEmailadresse(String emailadresse) {
        this.emailadresse = emailadresse;
    }

    public String getBenutzername() {
        return benutzername;
    }

}
