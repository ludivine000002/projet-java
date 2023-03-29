
import java.util.*;

/*class depot */
public class Depot {

	/*constructeur de depot */
    public Depot(Date heure_depot,String type_dechet) {
    	    	this.heure_depot = heure_depot;
    	    	this.type_dechet = type_dechet;}
    	
    /*attributs du depot */
    private Date heure_depot;
    private String type_dechet;
    
    /*getter et setters */
	public Date getHeure_depot() {
		return heure_depot;
	}
	public void setHeure_depot(Date heure_depot) {
		this.heure_depot = heure_depot;
	}
	public String getType_dechet() {
		return type_dechet;
	}
	public void setType_dechet(String type_dechet) {
		this.type_dechet = type_dechet;
	}

}