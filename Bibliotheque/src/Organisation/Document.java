package Organisation;

public class Document implements Imprimable {
	private int id;
	private String titre;
	public Document(int id, String titre) {
		
		this.id = id;
		this.titre = titre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDonnees() { return getId() + " " +getTitre();}

	public void imprimer() { }
		
}
