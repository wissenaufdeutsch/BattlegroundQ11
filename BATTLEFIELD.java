import java.util.*;
/**
 * This is where the Battle is going down.
 *
 * @author Michael Koopmans
 * @version 0.1
 */
public class BATTLEFIELD implements Runnable
{
    public enum RPS{Papier, Stein, Schere};

    private DARSTELLUNG d;

    private Random random;

    private BATTLEMODEL model;

    public BATTLEFIELD()
    {
        d = new TEXTVIEW();
        random = new Random();
        model = new BATTLEMODEL(3);
    }

    public void startBattle()
    {
        CheckContenders(); //prevent Cheating!
        d.Willkommen(); //heisst alle Willkommen
        pauseFuerAnimation(1000);
        d.BestOf(model.GibRunden()); //BestOf Format       
        pauseFuerAnimation(2000);
        d.PunkteVergabe(model.GibRunden()%2==0, 3,1,0); //Erklaert Punktesystem
        pauseFuerAnimation(3000);
        //Ab hier fight

        d.SucheNachCheatern();//Nachricht Doping
        CheckContenders();
        d.KampfBeginnt();
        for(int i=0; i<model.GibAnzahlTeilnehmer()-1; i=i+1) //linker Kontrahend ist nie der letzte
        {
            for(int j = i+1; j<model.GibAnzahlTeilnehmer();j++)
            {
                Kampf(i,j);

            }
        }

        BestimmePlaetze();
        pauseFuerAnimation(2000);
        d.Auswertung();
        pauseFuerAnimation(2000);
        for(int k = 0; k<model.GibAnzahlTeilnehmer(); k=k+1)
        {
            d.Endergebnis(0, model.GibName(k), model.GibPunkte(k));
            pauseFuerAnimation(1000);
        }
        
    }

    public void Kampf(int a, int b)
    {
        CONTENDER l = model.GibTeilnehmer(a);
        CONTENDER r = model.GibTeilnehmer(b);
        int siegeL = 0;
        int siegeR = 0;
        RPS lWahl;
        RPS rWahl;
        int rounds = model.GibRunden();
        d.Kampfansage(l,r);
        pauseFuerAnimation(2000);
        for (int i = 0; i <rounds; i++)
        {
            lWahl = Wahl(l);
            rWahl = Wahl(r);
            pauseFuerAnimation(2000);
            //Entscheidung, wer gewonnen hat
            if(lWahl==RPS.Stein && rWahl==RPS.Stein)
            {
                d.RundeUnentschieden(i+1,rounds);
            }
            else if(lWahl==RPS.Schere && rWahl==RPS.Schere)
            {
                d.RundeUnentschieden(i+1,rounds);
            }
            else if(lWahl==RPS.Papier && rWahl==RPS.Papier)
            {
                d.RundeUnentschieden(i+1,rounds);
            }
            else if(lWahl==RPS.Stein && rWahl==RPS.Schere) //l Sieg
            {
                siegeL = siegeL+1;
                d.RundeSieg(l, siegeL,siegeR);
            }
            else if(lWahl==RPS.Stein && rWahl==RPS.Papier) //l verliert
            {
                siegeR = siegeR+1;
                d.RundeSieg(r, siegeL,siegeR);
            }
            else if(lWahl==RPS.Schere && rWahl==RPS.Papier) //l Sieg
            {
                siegeL = siegeL+1;
                d.RundeSieg(l, siegeL,siegeR);
            }
            else if(lWahl==RPS.Schere && rWahl==RPS.Stein) //l verliert
            {
                siegeR = siegeR+1;
                d.RundeSieg(r, siegeL,siegeR);
            }
            else if(lWahl==RPS.Papier && rWahl==RPS.Schere) //l verliert
            {
                siegeR = siegeR+1;
                d.RundeSieg(r, siegeL,siegeR);
            }
            else if(lWahl==RPS.Papier && rWahl==RPS.Stein) //l sieg
            {
                siegeL = siegeL+1;
                d.RundeSieg(l, siegeL,siegeR);
            }
            if(l.IsCheater())
            {
                siegeL = 0;
            }
            if(r.IsCheater())
            {
                siegeR = 0;
            }
            pauseFuerAnimation(2000);
        }

        //Ergebnis nach drei Runden

        d.Kampfergebnis(l.GibName(), siegeL, r.GibName(), siegeR);
        pauseFuerAnimation(1000);
        if(siegeL>siegeR)
        {
            model.PunkteGeben(3, l);
            d.PunkteErhalten(l.GibName(),3, model.GibPunkte(a));
        }
        else if (siegeL==siegeR)
        {
            model.PunkteGeben(1, l);
            d.PunkteErhalten(l.GibName(), 1 , model.GibPunkte(a));
            pauseFuerAnimation(1000);
            model.PunkteGeben(1, r);
            d.PunkteErhalten(r.GibName(),1 , model.GibPunkte(b));
        }
        else
        {            
            model.PunkteGeben(3, r);
            d.PunkteErhalten(r.GibName(),3, model.GibPunkte(b));
        }
        pauseFuerAnimation(1500);
        d.NextBattle();

    }

    private RPS Wahl(CONTENDER c) 
    {
        double x = 0.0;
        x = random.nextDouble(); //Zahl zwischen 0.0 und 1.0
        if(x<c.gibWkeitPapier()) //hat c Papier gewaehlt?
        {
            d.Wahl(c,RPS.Papier);
            return RPS.Papier;
        }
        else
        {
            x = x-c.gibWkeitPapier();
            if(x<c.gibWkeitSchere()) // hat c Schere gewaehlt?
            {
                d.Wahl(c,RPS.Schere);
                return RPS.Schere;
            }
            else //c hat Stein gewählt!
            {
                d.Wahl(c,RPS.Stein);
                return RPS.Stein;
            }
        }
    }

    void CheckContenders()
    {
        for(int i = 0; i<model.GibAnzahlTeilnehmer(); i = i+1)
        {
            if(model.UeberpruefeCheater(i))
            {
                d.CheaterGefunden(model.GibName(i), model.GibWkeit(i));
                pauseFuerAnimation(1000);
            }
        }
    }

    private void BestimmePlaetze()
    {
        
    }
    
    public void TeilnehmerHinzu(CONTENDER neu)
    {
        model.TeilnehmerHinzu(neu);
    }
    public void run()
    {
        startBattle();
    }

    private void pauseFuerAnimation(int millisekunden)
    {
        try
        {

            Thread.sleep(millisekunden);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
