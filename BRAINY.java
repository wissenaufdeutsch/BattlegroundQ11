
/**
 * Beschreiben Sie hier die Klasse BRAINY.
 * 
 * @author (Lelo) 
 * @version (2020.06.25)
 */
public class BRAINY extends CONTENDER 
{
    

    /**
     * Konstruktor für Objekte der Klasse KP
     */
    public BRAINY()
    {
        super();
        SetzeName("Hund");
        SetzeBeschreibung("Der Hund hat eine gute Nase");
    }

    public double gibWkeitPapier()
    {
        return 0.5;
    }
    
    public double gibWkeitSchere()
    {
        return 0.3;
    }
    
    public double gibWkeitStein()
    {
        return 0.8;
    }
}
