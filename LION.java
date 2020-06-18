
/**
 * LION
 * by Aaron
 */
public class LION extends CONTENDER
{

    public LION()
    {
        super();
        SetzeName("Lion");
        SetzeBeschreibung("Mit dem Lion ist nicht zu spaßen!");
    }
    
    public double gibWkeitPapier()
    {
        return 0.2;
    }
    
    public double gibWkeitSchere()
    {
        return 0.3;
    }
    
    public double gibWkeitStein()
    {
        return 0.5;
    }

}
