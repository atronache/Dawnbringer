package Organisation;

import java.util.ArrayList;

public class Etagere implements Imprimable {
	private ArrayList<Document> listeDoc;
	private int nbrDocMax;
	
	public Etagere (int a) {
		
		listeDoc = new ArrayList<Document>();
		nbrDocMax= a;
	}
	
	public void AjoutDoc(Document nouv)
	{
		if(nbrDocMax>listeDoc.size())
		{
			listeDoc.add(nouv);
		}
	}
	
	public Document getDoc(int n) {
		if((n >= 0)&&(n < listeDoc.size()))
			return listeDoc.get(n);
		else
			return listeDoc.get(0);
	}
	
	public void aff_liste() {
		for(int i =0; i < listeDoc.size(); i++)
			System.out.println(listeDoc.get(i).getDonnees());
		System.out.println("");

	}

	
	public void imprimer() {
		for(int i =0; i<listeDoc.size() ; i++) {
			listeDoc.get(i).imprimer();
		}
	}

	public void triEtagere() {
		ArrayList<Document> listeTmp = new ArrayList<Document>();
		while(listeDoc.size() >0) {
			Document docTmp = listeDoc.get(0);
			for(int j =0; j < listeDoc.size(); j++) {
				if(listeDoc.get(j).getTitre().compareTo(docTmp.getTitre()) < 0)
					docTmp = listeDoc.get(j);
			}
			listeDoc.remove(docTmp);
			listeTmp.add(docTmp);
		}
		listeDoc = listeTmp;
	}
	
	
	
	
}


