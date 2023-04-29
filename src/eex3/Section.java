package eex3;

import java.util.ArrayList;

public class Section {
	private int numero;
	ArrayList<Etudiant> etd=new ArrayList<Etudiant>();
	public Section(int numero, ArrayList<Etudiant> etd) {
		this.numero = numero;
		this.etd = etd;
	}
	public void ajouterEtudiant(Etudiant e) {
		this.etd.add(e);
	}
	public void suprimierEtudiant(Etudiant e) {
		this.etd.remove(e);
	}
	public float moyenneSection() {
		float moy=0;
		for (int i = 0; i < etd.size(); i++) {
			moy += etd.get(i).getMoyenne();
		}
		return moy / etd.size();
	}
	public float getMoyenneMax() {
		float moy=this.etd.get(0).getMoyenne();
		for (int i = 1; i < etd.size(); i++) {
			if(moy<etd.get(i).getMoyenne())
			moy = etd.get(i).getMoyenne();
		}
		return moy;
	}
	public String toString() {
		return "Section [numero=" + numero + ", etd=" + etd + ", moyenneSection()=" + moyenneSection()
				+ ", getMoyenneMax()=" + getMoyenneMax() + "]";
	}
	
}
