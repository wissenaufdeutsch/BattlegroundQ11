
/**
 * Write a description of class START here.
 * 
 * @author Michael Koopmans
 * @version 0.1
 */
public class START
{
    private BATTLEFIELD b;

    public START()
    {
        b = new BATTLEFIELD();
        InitContenders();
        Animiere();
    }

    /**
     * Erstellt die Teilnehmer
     */
    public void InitContenders()
    {
        //Hier müssen neue Teilnehmer 
         
        CONTENDER v = new CHICKEN();
        b.TeilnehmerHinzu(v);
        CONTENDER c = new SCHUELER("Kilian");
        b.TeilnehmerHinzu(c);

    }

    /**
     * DONT CHANGE THIS!
     */
    private void Animiere()
    {
        Thread t = new Thread(b);
        t.run();
    }
}
