
/**
 * A genius. A criminal mastermind.
 * 
 * @author Johannes
 */
public class MASTERMIND extends CONTENDER
{
    private String name;
    private String beschreibung;
    private boolean cheater;
    int listener;
    public MASTERMIND()
    {
        name = "MASTERMIND";
        beschreibung = "A genius. A criminal mastermind.";
        cheater = false;
        listener = 0;
    }
    
    public double gibWkeitStein()
    {
        listener = 2;
        switch(listener)
        {
            case 1:
            return 0.1;
            case 2:
            return 0.8;
            case 3:
            return 0.1;
            default:
            return (1/3);
        }
    }
    
    public double gibWkeitSchere()
    {
        listener = 1;
        switch(listener)
        {
            case 1:
            return 0.8;
            case 2:
            return 0.1;
            case 3:
            return 0.1;
            default:
            return (1/3);
        }
    }
    
    public double gibWkeitPapier()
    {
        listener = 3;
        switch(listener)
        {
            case 1:
            return 0.1;
            case 2:
            return 0.1;
            case 3:
            return 0.8;
            default:
            return (1/3);
        }
    }
}
