package Organisation;

public class dictionnaires extends Document {
	private String langue;
	
	public String getLangue() {
		return langue;
	}
	
	public void setLangue(String langue) {
		this.langue = langue;
	}
	
	public dictionnaires(int id, String titre, String langue) {
		super(id, titre);
		this.langue = langue;
	}
	public String getDonnees() { return super.getDonnees() + " " +getLangue();}

}
