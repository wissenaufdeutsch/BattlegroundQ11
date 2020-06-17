
/**
 * Write a description of class START here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        //Hier müssen neue Teilnehmer rein
        CONTENDER a = new CHICKEN();
        a.SetzeName("Bernd");
        
        b.TeilnehmerHinzu(a); //Fuegt CHICKEN zu den Teilnehmern hinzu
        b.TeilnehmerHinzu(new CHICKEN()); //Fuegt CHICKEN zu den Teilnehmern hinzu
        
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
