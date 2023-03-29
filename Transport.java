import java.util.*;

public class transport {

    public transport(Integer id_transport,String liste_poubelle, String liste_centre, Date horaire_passage) {
    	this.horaire_passage=horaire_passage;
    	this.id_transport=id_transport;
    	this.liste_centre=liste_centre;
    	this.liste_poubelle=liste_poubelle;
    	
    }

    private Integer id_transport;

    private String liste_poubelle;

    private String liste_centre;

    public Integer getId_transport() {
		return id_transport;
	}

	public String getListe_poubelle() {
		return liste_poubelle;
	}

	public String getListe_centre() {
		return liste_centre;
	}

	public Date getHoraire_passage() {
		return horaire_passage;
	}

	public void setId_transport(Integer id_transport) {
		this.id_transport = id_transport;
	}

	public void setListe_poubelle(String liste_poubelle) {
		this.liste_poubelle = liste_poubelle;
	}

	public void setListe_centre(String liste_centre) {
		this.liste_centre = liste_centre;
	}

	public void setHoraire_passage(Date horaire_passage) {
		this.horaire_passage = horaire_passage;
	}

	private Date horaire_passage;

    public String deplacer() {
        return "";
    }

    public Integer get_id_transport() {
        return null;
    }

    public String getListePoubelle() {
        return "";
    }

    public String getListeCentre() {
        return "";
    }

    public Date getHorairePassage() {
        return null;
    }

    public Integer setIdTransport() {
        return null;
    }

    public String setListePoubelle() {
        return "";
    }

    public String setListeCentre() {
        return "";
    }

    public Date setHorairePassage() {
        return null;
    }

}
