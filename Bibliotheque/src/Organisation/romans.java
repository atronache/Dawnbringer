package Organisation;

public class romans extends Livre {
	private String awards;

	public String getAwards() {
		return awards;
	}
	
	public void setAwards(String awards) {
		this.awards = awards;
	}
	
	public romans(int id, String titre, int page, String auteur, String awards) {
		super(id, titre, page, auteur);
		this.awards = awards;
	}
	
	public String getDonnees() { return super.getDonnees() + " " +getAwards();}

}
