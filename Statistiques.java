
import java.util.*;

/**
 * 
 */
public class Statistiques {

    private double stat_geographiques;
    private double stat_temporelle;
  
    //Constructeur
    public Statistiques(double stat_geographiques, double stat_temporelle) {
        this.stat_geographiques = stat_geographique;
        this.stat_temporelle = stat_temporelle;
    }

    //Getters et Setters
    public double getStatGeographiques() {
        return stat_geographiques;
    }

    public void setStatGeographiques(double stat_geographiques) {
        this.stat_geographiques = stat_geographiques;
    }

    public double getStatTemporelle() {
        return stat_temporelle;
    }

    public void setStatTemporelle(double stat_temporelle) {
        this.stat_temporelle = stat_temporelle;
    }
    
     // Méthodes
    public double calculerMoyenneQtDepotQuartier0() {
        // TODO: Implémenter le calcul de la moyenne de la quantité de dépôts dans le quartier 0
        return 0.0;
    }

    public double calculerMoyenneHeureDepot0() {
        // TODO: Implémenter le calcul de la moyenne de l'heure de dépôt dans le quartier 0
        return 0.0;
    }

    public void etablirPoubelleMoinsRemplie0() {
        // TODO: Implémenter la méthode pour établir la poubelle la moins remplie dans le quartier 0
    }

    public void etablirPoubelleTropRemplie0() {
        // TODO: Implémenter la méthode pour établir la poubelle la plus remplie dans le quartier 0
    }

    public void modifierFreqRamassage0() {
        // TODO: Implémenter la méthode pour modifier la fréquence de ramassage dans le quartier 0
    }
}
