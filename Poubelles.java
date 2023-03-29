package javaproject;

import java.util.*; 

public class Poubelles {
/*attributs*/
	private Integer id_poubelle;
	private String type;
	private Integer capteurs; 
	private Boolean acces;

/*getters et setters*/
	public int getId_poubelle() {
		return id_poubelle;
	}
	
	public void setId_poubelle(int id_poubelle) {
		this.id_poubelle = id_poubelle;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getCapteurs() {
		return capteurs;
	}
	
	public void setCapteurs(int capteurs) {
		this.capteurs = capteurs;
	}
	
	public Boolean getAcces() {
		return acces;
	}
	
	public void setAcces(Boolean acces) {
		this.acces = acces;
	} 
	
	

}
