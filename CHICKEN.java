
/**
 * The CHICKEN!
 *
 * @author Michael Koopmans
 * @version 0.1
 */
public class CHICKEN extends CONTENDER
{

    /**
     * Constructor for objects of class CHICKEN
     */
    public CHICKEN()
    {
        super();
        SetzeName("Chicken");
        SetzeBeschreibung("Das Chicken ist besonders in großen Gruppen tödlich! Nicht ärgern!");
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
        return 0.2;
    }
    

}
