package poubelle;

import java.util.*;

public class commerces {

    
    
    public commerces(Integer id_commerces, String nom, String liste_prod_bonus) {
		super();
		this.id_commerces = id_commerces;
		this.nom = nom;
		this.liste_prod_bonus = liste_prod_bonus;
	}


	private Integer id_commerces;
    private String nom;
    private String liste_prod_bonus;
    
    public Integer getId_commerces() {
		return id_commerces;
	}

	public String getListe_prod_bonus() {
		return liste_prod_bonus;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setId_commerces(Integer id_commerces) {
		this.id_commerces = id_commerces;
	}

	public void setListe_prod_bonus(String liste_prod_bonus) {
		this.liste_prod_bonus = liste_prod_bonus;
	}

	/*
    public void nom_contrat() {
    	
    }

    public void debut_contrat() {
    	
    }

    public void fin_contrat(){
    	
    }

    public void renouveller_contrat() {
    }

  
    public void verifier_si_prod_dans_contrat() {
    }

    public void verifier_bons_achat() {
    }

    
    public void verifier_reduction() {
    }
	*/

}
