
/**
 * The CONTENDER handles one contender of the Scissor Paper Rock Tournament
 *
 * @author Michael Koopmans
 * @version 0.1
 */
public abstract class CONTENDER
{
    private String name;
    private String beschreibung;
    private boolean cheater;
    
    public CONTENDER()
    {
        name = "-";
        beschreibung = "--";
        cheater = false;
    }
    public String GibName()
    {
        return name;
    }
    
    public void SetzeName(String neu)
    {
        name = neu;
    }
    
    public String GibBeschreibung()
    {
        return beschreibung;
    }
    
    public void SetzeBeschreibung(String neu)
    {
        beschreibung = neu;
    }
    
    public abstract double gibWkeitSchere();
    
    public abstract double gibWkeitStein();
    
    public abstract double gibWkeitPapier();
    
    public boolean IsCheater()
    {
        return cheater;
    }
    
    public void SetzeCheater()
    {
        cheater = true;
    }
}
