
import java.util.*;

/**
 * 
 */
public abstract class Poubelles {

    /**
     * Default constructor
     */
    public Poubelles() {
    }

    /**
     * 
     */
    private Integer id_poubelle;

    /**
     * 
     */
    public void capacité max;

    /**
     * 
     */
    public void emplacement;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private Boolean accès;

    /**
     * 
     */
    private Integer capteurs;

    /**
     * 
     */
    public void contenir verre() {
        // TODO implement here
    }

    /**
     * 
     */
    public void contenir carton() {
        // TODO implement here
    }

    /**
     * 
     */
    public void conetnir papier() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Boolean contenir_dechet() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void crediter compte() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Boolean identifier_user() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void calculer qt dechet() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Boolean verifier_conformite() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Integer donner_penalite() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Integer donner_pt_fidelite() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public integer envoyer_notif_si_qt_max() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Float calculer_qt_depose() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public integer getIdPoubelle() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public integer setIdPoubelle() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public string getType() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public string setType() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean getAcces() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean setAcces() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public integer getCapteurs() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public integer setCapteurs() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public abstract Boolean contenir_papier();

    /**
     * @return
     */
    public abstract float getCapaciteMax();

    /**
     * @return
     */
    public abstract Float setCapaciteMax();

    /**
     * @return
     */
    public abstract String getEmplacement();

    /**
     * @return
     */
    public abstract String setEmplacement();

    /**
     * @return
     */
    public abstract Boolean contenir_carton();

    /**
     * @return
     */
    public abstract Boolean contenir_plastique();

    /**
     * @return
     */
    public abstract Boolean contenir_metal();

    /**
     * @return
     */
    public abstract Boolean contenir_dechet();

    /**
     * @return
     */
    public abstract Boolean contenir_verre();

    /**
     * 
     */
    public void Operation2() {
        // TODO implement here
    }

}