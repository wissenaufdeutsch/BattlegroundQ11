/**
 * The MARCELLO only picks Rock because who the frick picks Paper which
 * in turn makes Scissors useless
 */
public class MARCELLO extends CONTENDER {
     MARCELLO(){
        super();
        SetzeName("Marcello");
        SetzeBeschreibung("Unstoppable Force (Malphite R)");
      }
    
     @Override public double gibWkeitStein() {
        return 1;
     }
    
     @Override public double gibWkeitSchere() {
        return 0;
     }
    
     @Override public double gibWkeitPapier() {
        return 0;
     }
    
}