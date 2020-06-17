
/**
 * Write a description of class TEXT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TEXT
{
    // instance variables - replace the example below with your own
    private String text;

    private int x,y;
    
    /**
     * Constructor for objects of class TEXT
     */
    public TEXT()
    {
        text = "Text";
        x = 100;
        y = 100;

    }
    
    public void Zeichne()
    {
        ZEICHENFENSTER.gibFenster().zeichneText(text,x,y);
    }

    public void Loesche()
    {
        ZEICHENFENSTER.gibFenster().loescheText(text,x,y);
    }
    
    public void PositionSetzen(int xNeu, int yNeu)
    {
        x = xNeu;
        y = yNeu;
        
    }    
    
    public void TextSetzen(char textNeu)
    {
        text = textNeu+"";
    }
    
}
