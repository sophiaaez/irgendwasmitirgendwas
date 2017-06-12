/**
 * Created by monaw on 10.04.2017.
 */
public class Auftrag {
    private long auftragsnummer;
    private boolean erledigt;
    private Kunde auftraggeber;
    private Anbieter erlediger;

    public Auftrag(long auftragsnummer, Kunde auftraggeber) {
        this.auftragsnummer = auftragsnummer;
        this.auftraggeber = auftraggeber;
        this.erledigt = false;
    }

    public void erledigt(Anbieter erlediger){
        this.erledigt = true;
        this.erlediger = erlediger;
    }
}
