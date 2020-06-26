
/**
 * The Logan!
 *
 * @author Michael Koopmans
 * @version 0.1
 */
public class Logan extends CONTENDER
{

    /**
     * Constructor for objects of class CHICKEN
     */
    public Logan()
    {
        super();
        SetzeName("Logan");
        SetzeBeschreibung("Logan ist ein 23 jähriger Neuseeländer der vor 10 Jahren nach Berlin gezogen ist. Seit dem Lebt er dort mit seinem 27 jährigem Freund und zusammen leiten sie ein start up unternehmen das sich für fair trade Produkte einsetzt");
    }
    
    public double gibWkeitPapier()
    {
        return 0.3;
    }
    
    public double gibWkeitSchere()
    {
        return 0.3;
    }
    
    public double gibWkeitStein()
    {
        return 0.4;
    }
    

}
