import java.util.*;

/**
 * Holds the model of the Battlefield
 *
 * @author M.Koopmans
 * @version 0.1
 */
public class BATTLEMODEL
{
    private ArrayList<CONTENDER> contenders;

    private int [] punkte;

    private int rounds;

    /**
     * Constructor for objects of class BATTLEMODEL
     */
    public BATTLEMODEL(int runden)
    {
        contenders = new ArrayList<CONTENDER>();
        rounds = runden;
    }

    public int GibRunden()
    {
        return rounds;
    }

    public void TeilnehmerHinzu(CONTENDER neu)
    {
        contenders.add(neu);
        punkte = new int[contenders.size()]; 
    }

    public void PunkteGeben(int anzahl, CONTENDER teilnehmer)
    {
        punkte[contenders.indexOf(teilnehmer)] = punkte[contenders.indexOf(teilnehmer)] + anzahl;
    }

    public int GibAnzahlTeilnehmer()
    {
        return contenders.size();
    }

    public boolean UeberpruefeCheater(int index)
    {
        CONTENDER c = contenders.get(index);
        double w = GibWkeit(index);
        if(w>1)
        {
            c.SetzeCheater();
            return true;
        }
        return false;
    }

    public int GibPunkte(int index)
    {
        return punkte[index];
    }
    
    public CONTENDER GibTeilnehmer(int index)
    {
        return contenders.get(index);
    }
    
    public String GibName(int index)
    {
        return contenders.get(index).GibName();
    }

    public double GibWkeit(int index)
    {
        CONTENDER c = contenders.get(index);
        return c.gibWkeitPapier()+c.gibWkeitSchere()+c.gibWkeitStein();
    }
    
    /*
    public void sortiereNachPunkten()
    {
        int end = GibAnzahlTeilnehmer();
        ArrayList temp = new ArrayList<CONTENDERS>();
        int[] punkteNeu = new int[GibAnzahlTeilnehmer()];
        int higest = punkte[0];
        int index = 0;
        for (int k=0;k<GibAnzahlTeilnehmer();k=k+1)
        {
            for(int i=0; i<end; i=i+1)
            {
                if(punkte[
            }
            end = end-1;
        }
    }*/
}
