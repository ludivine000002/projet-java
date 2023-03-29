
import java.util.*;

/**
 * 
 */
public class Rejet {
    
    private float cout;
    private float taux_Pollution;
    
    // Constructeur
    public Rejet(float cout, float taux_Pollution) {
        this.cout = cout;
        this.taux_Pollution = taux_Pollution;
    }
    
    // Getters et setters
    public float getCout() {
        return cout;
    }
    
    public void setCout(float cout) {
        this.cout = cout;
    }
    
    public float getTauxPollution() {
        return taux_Pollution;
    }
    
    public void setTauxPollution(float taux_Pollution) {
        this.taux_Pollution = taux_Pollution;
    }
    
    // Méthodes
    public void envoyer_ds_site_enfouissement0() {
        // TODO : implémenter la méthode pour envoyer le rejet dans le site d'enfouissement du quartier 
    }
    
    public float getCout0() {
        // TODO : implémenter la méthode pour récupérer le coût du rejet dans le quartier 
        return 0.0f;
    }
    
    public void setCout0(float cout) {
        // TODO : implémenter la méthode pour modifier le coût du rejet dans le quartier 
    }
    
    public float getTauxPollution0() {
        // TODO : implémenter la méthode pour récupérer le taux de pollution du rejet dans le quartier 
        return 0.0f;
    }
    
    public void setTauxPollution0(float taux_Pollution) {
        // TODO : implémenter la méthode pour modifier le taux de pollution du rejet dans le quartier 
    }
}
