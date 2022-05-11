
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
        b.TeilnehmerHinzu(c);
        CONTENDER w = new WASCHBÄR();
        b.TeilnehmerHinzu(w);


        CONTENDER ws= new WILLSMITH();
        
      b.TeilnehmerHinzu(ws); //Fuegt WILLSMITH hinzu


       
        CONTENDER k = new SCHUELER("Kilian");
        b.TeilnehmerHinzu(k);

        CONTENDER m = new MIAMI();
        b.TeilnehmerHinzu(m);

        CONTENDER p = new PLATYPUS();
        b.TeilnehmerHinzu(p);       
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
