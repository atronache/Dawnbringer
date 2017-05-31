package Organisation;
import java.util.ArrayList;

public class Bibliotheque {
	
	private ArrayList<Etagere> etageres;
	
	public Bibliotheque () {
		etageres = new ArrayList<Etagere>();
	}
	
	public Etagere getEtagere(int n) {
		if((n >= 0)&&(n < etageres.size()))
			return etageres.get(n);
		else
			return etageres.get(0);
	}
	
	public void AjoutEtagere(Etagere nouv)
	{
		etageres.add(nouv);
	}


}
