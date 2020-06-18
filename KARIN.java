

public class KARIN extends CONTENDER
{
    
    public KARIN()
    {
       super();
       SetzeName("Karin");
       SetzeBeschreibung("Hauptsache ich bin dabei!");
    }

    public double gibWkeitSchere()
    {
        return 0.9;
    }
    
    public double gibWkeitStein()
    {
        return 0.1;
    }
    
    public double gibWkeitPapier()
    {
        return 0.0;
    }
}
