package Organisation;

public class Test {
	public static void main(String[] args) {
		Bibliotheque Pompidou=new Bibliotheque();
		Pompidou.AjoutEtagere(new Etagere(100));
		Pompidou.getEtagere(0).AjoutDoc(new revues(1022,"Panorama",10,2012));
		Pompidou.getEtagere(0).AjoutDoc(new romans(1023,"Harry Bo",150,"C'EbolaVie","Comedie"));
		Pompidou.getEtagere(0).AjoutDoc(new revues(1024,"Plaie Boille",9,2020));
		Pompidou.getEtagere(0).AjoutDoc(new Livre(1025,"Plaie Mobile",15465,"Phillipe Poutou"));

		
		Pompidou.getEtagere(0).aff_liste();
		Pompidou.getEtagere(0).triEtagere();
		Pompidou.getEtagere(0).aff_liste();
	
		
		System.out.println("");
		Pompidou.getEtagere(0).imprimer();
	}
}
