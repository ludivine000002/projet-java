import java.util.*;

/*class dechets */
public class Dechets {

	/*constructeur de la classe déchet */
    public Dechets(String type,Float poids) {
    	this.type = type;
    	this.poids = poids;
    	
    }

  /*attributs de la classe déchet */
    private String type;
    private Float poids;

    /*getter et setters*/
    public Float getPoids() {
        return null;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPoids(Float poids) {
		this.poids = poids;
	}

}
	
	
	// La classe Verre qui hérite de la classe Dechet
	public class Verre extends Dechets {
	
		/*attribut*/
		private Float pv;
		
	    // Constructeur
	    public Verre(String type,Float poids,float pv) {
	        super(type,poids);
	        this.pv = pv;
	    }

	    /*getter et setter*/
	    
	    public float getPv() {
	        return pv;
	    }

	    public void setPv(float pv) {
	        this.pv = pv;
	    }
	
	}
	
	// La classe Plastique qui hérite de la classe Dechet
		public class Plastique extends Dechets {
		
			/*attribut*/
			private Float pp;
			
		    // Constructeur
		    public Plastique(String type,Float poids,float pp) {
		        super(type,poids);
		        this.pp = pp;
		    }

		    /*getter et setter*/
		    
		    public float getPp() {
		        return pp;
		    }

		    public void setPv(float pp) {
		        this.pp = pp;
		    }
		}
		
		// La classe Carton qui hérite de la classe Dechet
				public class Carton extends Dechets {
				
					/*attribut*/
					private Float pc;
					
				    // Constructeur
				    public Carton(String type,Float poids,float pc) {
				        super(type,poids);
				        this.pc = pc;
				    }

				    /*getter et setter*/
				    
				    public float Getpc() {
				        return pc;
				    }

				    public void setPv(float pc) {
				        this.pc = pc;
				    }
				}
						
				// La classe Metal qui hérite de la classe Dechet
				public class Metal extends Dechets {
				
					/*attribut*/
					private Float pm;
					
				    // Constructeur
				    public Metal(String type,Float poids,float pm) {
				        super(type,poids);
				        this.pm = pm;
				    }

				    /*getter et setter*/
				    
				    public float Getpm() {
				        return pm;
				    }

				    public void setPm(float pm) {
				        this.pm = pm;
				    }
				}
