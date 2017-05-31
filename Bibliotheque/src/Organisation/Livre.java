package Organisation;

public class Livre extends Document {
	private int page;
	private String auteur;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public Livre(int id, String titre, int page, String auteur) {
		super(id, titre);
		this.page = page;
		this.auteur = auteur;
	}
	public String getDonnees() { return super.getDonnees() +" " +getAuteur() +" " +getPage(); }
	
	public void imprimer() {
		System.out.println("Impression du document : " +getDonnees());

	}
	
}
