
/**
 * The CHICKEN!
 *
 * @author Michael Koopmans
 * @version 0.1
 */
public class GOD extends CONTENDER
{

    /**
     * Constructor for objects of class CHICKEN
     */
    public GOD()
    {
        super();
        SetzeName("Chicken");
        SetzeBeschreibung("Das Chicken ist besonders in großen Gruppen tödlich! Nicht ärgern!");
    }
    
    public double gibWkeitPapier()
    {
        return 1.0;
    }
    
    public double gibWkeitSchere()
    {
        return 0.0;
    }
    
    public double gibWkeitStein()
    {
        return 0.0;
    }
    

}
