

import java.util.*;

/*class menages */
public class Menages {

/*constructeur du menage */
	
    public Menages( Integer id_menage,String adresse_menage, Integer pt_fidelite,String nom) {
    	this.id_menage = id_menage;
    	this.adresse_menage = adresse_menage;
    	this.pt_fidelite = pt_fidelite;
    	this.pt_fidelite = pt_fidelite;}
    	
    	 /*attributs du menage */
    	 private Integer id_menage;
    	 private String adresse_menage;
         protected String nom;
    	 protected Integer pt_fidelite;
    	 
    	 
    	 /*getter et setter du menage */
    	    public Integer getId_menage() {
    			return id_menage;
    		}

    		public void setId_menage(Integer id_menage) {
    			this.id_menage = id_menage;
    		}

    		public String getAdresse_menage() {
    			return adresse_menage;
    		}

    		public void setAdresse_menage(String adresse_menage) {
    			this.adresse_menage = adresse_menage;
    		}

    		public String getNom() {
    			return nom;
    		}
    		
    		public void setNom(String nom) {
    			this.nom = nom;
    		}
    		
    		public Integer getPt_fidelite() {
    			return pt_fidelite;
    		}

    		public void setPt_fidelite(Integer pt_fidelite) {
    			this.pt_fidelite = pt_fidelite;
    		}

    	 
    	
    	 /*
    	 public void id poubelle;
    	 
    	 public void heure depot;
    	 public void type dechet;
    	 public void plastique;
    	 public void metal;
    	 public void verre;
    	 public void carton;
        

        
       

        
        
        /*méthodes*/
    

  /*
    public Integer convertir_bons_achat() {
       
        return null;
        }

    /**
     * @param nom 
     * @return
     */
    	 
    	 /*
    public Menages creer_compte(String nom) {
        return null;
    }

    public date consulter_historique_depot() {
        
        return null;
    }


    public void get heure depot() {
        // TODO implement here
    }

    public Boolean deposer_verre() {
        return null;
    }

    public Boolean deposer_carton() {
       return null;
    }

    public Boolean deposer_dechet() {
        return null;
    }

    public Boolean deposer_papier() {
       return null;
    }

    public Integer consulter_solde() {
        return null;
    }

    public Integer convertir_reductions() {
        return null;
    }

    public Integer getIdMenage() {
        return null;
    }

    public Integer setIdMenage() {
       return null;
    }

    public String getAdresseMenage() {
        return null;
    }

    public String setAdresseMenage() {
        return null;
    }

    public Integer getpointFidelite() {
        return null;
    }

    public Integer setpointFidelite() {
        return null;
    }

    public String getNom() {
       return null;
    }

    public String setNom() {
        return null;
    }
    
    */
    


	public class Depot {
        private TypeDepot type;
        private Date heure;

        public Depot(TypeDepot type, Date heure) {
            this.type = type;
            this.heure = heure;
        }
