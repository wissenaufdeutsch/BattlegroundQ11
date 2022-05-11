


public class SCHUELER extends CONTENDER
{
    public SCHUELER(String name)
    {
        super();
        SetzeName(name);
        SetzeBeschreibung(name+" ist nicht sehr schlau");
    }
    
    public double gibWkeitPapier()
    {
        return 0.05;
    }
    
    public double gibWkeitSchere()
    {
        return 0.05;
    }
    
    public double gibWkeitStein()
    {
        return 0.9;
    }
    

}
