import java.util.List;

/**
 * Created by monaw on 10.04.2017.
 */
public class Kunde {
    private PersoenlicheDaten persoenlicheDaten;
    private long kundennummer;
    private List<Auftrag> aufgegebeneAuftraege;

    public Kunde(PersoenlicheDaten persoenlicheDaten, long kundennummer) {
        this.persoenlicheDaten = persoenlicheDaten;
        this.kundennummer = kundennummer;
    }

    public void neuerAuftrag(Auftrag auftrag) {
        aufgegebeneAuftraege.add(auftrag);
    }

    public void loescheAuftrag(Auftrag auftrag){
        aufgegebeneAuftraege.remove(auftrag);
    }
}
