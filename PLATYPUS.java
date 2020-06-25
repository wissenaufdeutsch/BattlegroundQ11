/**
 * The PLATYPUS!
 *
 * @author Maria Wechsler
 * @version 0.1
 */
public class PLATYPUS extends CONTENDER
{

    /**
     * Constructor for objects of class PLATYPUS
     */
    public PLATYPUS()
    {
        super();
        SetzeName("platypus");
        SetzeBeschreibung("Sollten sie Dofenschmirz sein: Rennen Sie so schnell wie möglich! Es hat einen Hut!");
    }
    
    public double gibWkeitPapier()
    {
        return 0.364;
    }
    
    public double gibWkeitSchere()
    {
        return 0.218;
    }
    
    public double gibWkeitStein()
    {
        return 0.418;
    }
    

}

