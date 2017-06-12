/**
 * Created by monaw on 10.04.2017.
 */
public class Mensch {
        private PersoenlicheDaten persoenlicheDaten;

    public Mensch(PersoenlicheDaten persoenlicheDaten) {
        this.persoenlicheDaten = persoenlicheDaten;
    }

    public void setAdresse(Adresse adresse) {
        this.persoenlicheDaten.setAdresse(adresse);
    }

    public void setKontodaten(Kontodaten kontodaten){
        this.persoenlicheDaten.setKontodaten(kontodaten);
    }

    public void setNachname(String nachname){
        this.persoenlicheDaten.setNachname(nachname);
    }

    public void setPersoenlicheDaten(PersoenlicheDaten persoenlicheDaten){
        this.persoenlicheDaten = persoenlicheDaten;
    }

    public void setVorname(String vorname){
        this.persoenlicheDaten.setVorname(vorname);
    }
}
