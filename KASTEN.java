public class KASTEN
{
    private int x;
    private int y;

    private int breite;
    private int hoehe;
    
    String farbe;

    public KASTEN()
    {
        x = 50;
        y = 100;
        breite = 200;
        hoehe = 40;
        farbe = "weiss";

    }

    public void Zeichne()
    {
        ZEICHENFENSTER.gibFenster().zeichneRechteck(x,y,breite,hoehe);
    }
    
    public void Loesche()
    {
        ZEICHENFENSTER.gibFenster().loescheRechteck(x, y, breite+1, hoehe+1);
    }

    public void PositionSetzen(int xNeu, int yNeu)
    {
        
        x = xNeu;
        y= yNeu;

    }
    
    public void GroesseSetzen(int bNeu, int hNeu)
    {

        breite = bNeu;
        hoehe = hNeu;

    }
    
    public void Fuelle(String farbe)
    {
        ZEICHENFENSTER.gibFenster().fuelleRechteck(x,y,breite,hoehe, farbe);
    }
    
}
