package poubelle;
import java.util.*;

public class contrat {
	
	private Integer id_contrat;
    private String nom_contrat;
    private Date debut_contrat;
    private Date fin_contrat;
    private String produit;
    private Integer pt_necessaires;
    private Integer pt_necessaire;
    private float bon_reduction;
    private float bon_achat;
	
    public contrat(Integer id_contrat, String nom_contrat, Date debut_contrat, Date fin_contrat, String produit,
			Integer pt_necessaires, Integer pt_necessaire, float bon_reduction, float bon_achat) {
		super();
		this.id_contrat = id_contrat;
		this.nom_contrat = nom_contrat;
		this.debut_contrat = debut_contrat;
		this.fin_contrat = fin_contrat;
		this.produit = produit;
		this.pt_necessaires = pt_necessaires;
		this.pt_necessaire = pt_necessaire;
		this.bon_reduction = bon_reduction;
		this.bon_achat = bon_achat;
	}

	public Integer getId_contrat() {
		return id_contrat;
	}

	public String getNom_contrat() {
		return nom_contrat;
	}

	public Date getDebut_contrat() {
		return debut_contrat;
	}

	public Date getFin_contrat() {
		return fin_contrat;
	}

	public String getProduit() {
		return produit;
	}

	public Integer getPt_necessaires() {
		return pt_necessaires;
	}

	public Integer getPt_necessaire() {
		return pt_necessaire;
	}

	public float getBon_reduction() {
		return bon_reduction;
	}

	public float getBon_achat() {
		return bon_achat;
	}

	public void setId_contrat(Integer id_contrat) {
		this.id_contrat = id_contrat;
	}

	public void setNom_contrat(String nom_contrat) {
		this.nom_contrat = nom_contrat;
	}

	public void setDebut_contrat(Date debut_contrat) {
		this.debut_contrat = debut_contrat;
	}

	public void setFin_contrat(Date fin_contrat) {
		this.fin_contrat = fin_contrat;
	}

	public void setProduit(String produit) {
		this.produit = produit;
	}

	public void setPt_necessaires(Integer pt_necessaires) {
		this.pt_necessaires = pt_necessaires;
	}

	public void setPt_necessaire(Integer pt_necessaire) {
		this.pt_necessaire = pt_necessaire;
	}

	public void setBon_reduction(float bon_reduction) {
		this.bon_reduction = bon_reduction;
	}

	public void setBon_achat(float bon_achat) {
		this.bon_achat = bon_achat;
	}

	/*
    public Contrat renouveler_contrat() {
        return null;
    }*/

}
