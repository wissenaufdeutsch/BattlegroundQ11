
/**
 * Write a description of class KREIS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KREIS
{
  
    private int x,y,r;

    /**
     * Constructor for objects of class KREIS
     */
    public KREIS()
    {
        x = 100;
        y = 100;
        r = 5;

    }

    public void MittelpunktSetzen(int xNeu, int yNeu)
    {
        
        x = xNeu;
        y = yNeu;

    }
    
    public void Zeichne()
    {   
        ZEICHENFENSTER.gibFenster().zeichneKreis(x, y, r);
    }
    
    public void Loesche()
    {
        ZEICHENFENSTER.gibFenster().loescheKreis(x, y, r);    
    }
    
    public void Fuelle(String farbe)
    {
        ZEICHENFENSTER.gibFenster().fuelleKreis(x,y,r,farbe);
    }
    
}
