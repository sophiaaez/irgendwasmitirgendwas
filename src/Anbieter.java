import java.util.List;
/**
 * Created by monaw on 10.04.2017.
 */

public class Anbieter extends Mensch{
    private long anbieternummer;
    private boolean umsatzsteuerpflichtig;
    private boolean hausbesuche;
    private List<Auftrag> erledigteAuftraege;

    public Anbieter(PersoenlicheDaten persoenlicheDaten, long anbieternummer, boolean umsatzsteuerpflichtig, boolean hausbesuche) {
        super(persoenlicheDaten);
        this.anbieternummer = anbieternummer;
        this.umsatzsteuerpflichtig = umsatzsteuerpflichtig;
        this.hausbesuche = hausbesuche;
    }

    public void setUmsatzsteuerpflichtig(boolean umsatzsteuerpflichtig) {
        this.umsatzsteuerpflichtig = umsatzsteuerpflichtig;
    }

    public void setHausbesuche(boolean hausbesuche) {
        this.hausbesuche = hausbesuche;
    }

    public void erledigeAuftrag(Auftrag auftrag){
        this.erledigteAuftraege.add(auftrag);
    }
}
