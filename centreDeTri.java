
import java.util.*;

/* classe centre de tri */
public class centreDeTri {
    
     /* constructeur du centre de tri */
	
    public centreDeTri( Integer id_centre,String nom,String adresse) {
    	this.id_centre = id_centre;
    	this.nom = nom;
    	this.adresse = adresse;
    }

    /*attributs du centre de tri */
    private Integer id_centre;
    private String nom;
    private String adresse;
    private Float quantite;

    /*objet agrégation avec poubelle */
    public  Poubelles poubelles;

    
    
    /*méthodes*/
    public Integer recevoir_poubelles() {
        return id_poubelle;
    }

    /*le tri se fait manuellement si c'est un epoubelle jaune*/
    public boolean trier_manuellement() {
        return false;
    }

    public boolean trier_machines() {
        return false;
    }

 
    public String distribuer_poubelle_ds_quartier() {
        return null;
    }


    public String ajouter_poubelle() {
        return null;
    }

    public String retirer_poubelle() {
        return null;
    }
    
    public String collecter_dechet() {
        return null;
    }

    public Float calculer_qt_depose() {
        return quantite;
    }

    public void predictions_orga() {
    }

    public String classer_dechets() {
        return null;
    }

    public boolean mettre_dans_ballots() {
        // TODO implement here
        return false;
    }

    public float definir_prix_ballot() {
        return 0.0f;
    }

    public float vendre_ballots() {
        return 0.0f;
    }

    
    
   /*Getters*/
    public Integer getIdCentre() {
        return id_centre;
    }

    public String getNom() {
        return nom;
    }
    
    public String getAdresse() {
        return adresse;
    }
    
        
    }   public date get_heure_depot() {
        // TODO implement here
        return null;
    }
    public date getQuantite() {
        // TODO implement here
        return null;
    }
   
    public string get_localisation_depot() {
        // TODO implement here
        return null;
    }
    
    
    /*getter de l'agrégation */
    
    public Poubelles getPoubelles() {
        return poubelles;}
        
    /*Setters*/
    public void setIdCentre() {
        this.id_centre = id_centre;
    }
    public void setNom() {
    	this.nom = nom;
    }

    public void setAdresse() {
    	this.adresse = adresse;
    }
    
    
    public void setQuantite() {
    	this.quantite = quantite;
    }
    
    /* setter de l'agregation*/
    public void setPoubelles() {
    	this.poubelles = poubelles;
    }

}