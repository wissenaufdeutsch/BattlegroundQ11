
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
        CONTENDER c = new CHICKEN();
        b.TeilnehmerHinzu(c); //Fuegt CHICKEN zu den Teilnehmern hinzu
        
        CONTENDER d = new BRAINY();
        b.TeilnehmerHinzu(d);

        CONTENDER m = new MARCELLO();
        b.TeilnehmerHinzu(m);
        
        CONTENDER f = new MASTERMIND();
        b.TeilnehmerHinzu(f);
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
