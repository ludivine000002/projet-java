
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
					
