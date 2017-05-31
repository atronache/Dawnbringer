package Organisation;

public class revues extends Document {
public int getMoi() {
		return moi;
	}
	public void setMoi(int moi) {
		this.moi = moi;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	

public revues(int id, String titre, int moi, int annee) {
	super(id, titre);
	this.moi = moi;
	this.annee = annee;
}

	public String getDonnees() { return super.getDonnees() + " " +getMoi() +"/" +getAnnee();}

private int moi;
private int annee;


}
