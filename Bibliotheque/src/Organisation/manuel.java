package Organisation;

public class manuel extends Livre {
public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

public manuel(int id, String titre, int page, String auteur, int niveau) {
		super(id, titre, page, auteur);
		this.niveau = niveau;
	}
public String getDonnees() { return super.getDonnees() + " " +getNiveau();}

private int niveau;
}
