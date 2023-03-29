
import java.util.*;

/**
 * 
 */
public class poubelleVerte extends Poubelles {

    /**
     * Default constructor
     */
    public poubelleVerte() {
    }

    /**
     * 
     */
    private Float capacité_max;

    /**
     * 
     */
    private String emplacement;

    /**
     * @return
     */
    public Boolean contenir_verre() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public float getCapaciteMax() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public Float setCapaciteMax() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getEmplacement() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String setEmplacement() {
        // TODO implement here
        return "";
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

}