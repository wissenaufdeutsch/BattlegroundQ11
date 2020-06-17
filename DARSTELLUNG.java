
public interface DARSTELLUNG
{
    
    public void Willkommen();
    
    public void BestOf(int rounds);
    
    public void PunkteVergabe(boolean unentschiedenMoeglich, int s, int u, int n);
    
    public void SucheNachCheatern();
    
    public void CheaterGefunden(String name, double Wkeit);
    
    public void KampfBeginnt();
    
    public void Kampfansage(CONTENDER l, CONTENDER r);
    
    public void Kampfergebnis(String nameL, int siegeL, String nameR, int siegeR);
    
    public void Wahl(CONTENDER c,BATTLEFIELD.RPS w);
    
    public void NextBattle();
    
    public void RundeUnentschieden(int runde, int von);
    
    public void RundeSieg(CONTENDER c, int siegeL,int siegeR);
    
    public void PunkteErhalten(String wem, int anzahl, int neuePunkte);
    
    public void Endergebnis( int platz, String name, int punke);
    
    public void Auswertung();
}
