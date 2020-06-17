
/**
 * Write a description of class TEXTVIEW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TEXTVIEW implements DARSTELLUNG
{
    public TEXTVIEW()
    {

    }

    public void Willkommen()
    {
        so("Willkommen in der Arena!"); 
    }

    public void BestOf(int rounds)
    {
        so("Heute wird unser Schere Stein Papier Turnier im Best-Of " + rounds+ " Format ausgetragen!");
    }
    
    public void PunkteVergabe(boolean unentschiedenMoeglich, int sieg, int unentschieden,int niederlage)
    {
        so("Punkte werden wie folgt vergeben:");
        so("Sieg: " + sieg + " P.");
        if(unentschiedenMoeglich)
        {
           so("Unentschieden: " + unentschieden + " P. für beide");
        }
        so("Niederlage: "+ niederlage+" P.");        
    }

    public void SucheNachCheatern()
    {
        so("Nach der Dopingkontrolle geht es los!");
    }
    
    public void CheaterGefunden(String name, double Wkeit)
    {
        so("Cheater " + name + " hat Wkeit "+ Wkeit + " und verliert automatisch alle Spiele!");
    }
    public void KampfBeginnt()
    {
        so("--------------");
        so("Der Kampf beginnt!");
    }
    
    public void Kampfansage(CONTENDER l, CONTENDER r)
    {
        so(l.GibName()+ " vs. "+r.GibName());        
    }
    
    public void Wahl(CONTENDER c,BATTLEFIELD.RPS w)
    {
        if(w == BATTLEFIELD.RPS.Papier)
        {
            so(c.GibName() + " wählt Papier!");
        }
        else if(w == BATTLEFIELD.RPS.Schere)
        {
            so(c.GibName() + " wählt Schere!");
        }
        else
        {
            so(c.GibName() + " wählt Stein!");
        }
    }
    
    public void RundeUnentschieden(int runde, int von)
    {
        so("Ergebnis Runde " + runde + " von " + von + ": Unentschieden.");
    }
    
    public void RundeSieg(CONTENDER c, int siegeL,int siegeR)
    {
        so("Sieg für " + c.GibName() + "! Es steht " + siegeL + ":" + siegeR);
    }
    
    public void Kampfergebnis(String nameL, int siegeL, String nameR, int siegeR)
    {
        if(siegeL>siegeR)
        {
            so("Sieger des Duells ist " + nameL + "!");
        }
        else if (siegeL==siegeR)
        {
            so("Das Duell endet Unentschieden.");
        }
        else
        {            
            so("Sieger des Duells ist " + nameR + "!");
        }
    }
    
    public void NextBattle()
    {
        so("----------------");
    }
    
    public void PunkteErhalten(String wem, int anzahl, int neuePunkte)
    {
        so(wem + " erhält " + anzahl + " Punkte. Neuer Punktestand: " + neuePunkte);
    }
    
    public void Endergebnis( int platz, String name, int punkte)
    {
        so(platz + ". Platz: "+ name + " mit " + punkte + " Punkte");
    }
    
    public void Auswertung()
   {
       so("Kommen wir zur Auswertung:");
    }
    
    private void so(String a)
    {
        System.out.println(a);
    }
}
