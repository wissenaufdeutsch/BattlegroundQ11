
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



        CONTENDER v = new CHICKEN();
        b.TeilnehmerHinzu(v);
        CONTENDER c = new SCHUELER("Kilian");
        b.TeilnehmerHinzu(c);
      //Fuegt CHICKEN zu den Teilnehmern hinzu

        CONTENDER w= new WILLSMITH();
        
      b.TeilnehmerHinzu(w); //Fuegt WILLSMITH hinzu




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
