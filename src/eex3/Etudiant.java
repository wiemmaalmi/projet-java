package eex3;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	private String nom;
	private String prenom;
	private int cin;
	private ArrayList<Integer> note = new ArrayList<Integer>();

	public Etudiant(String nom, String prenom, int cin, ArrayList<Integer> note) {
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.note = note;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public ArrayList<Integer> getNote() {
		return note;
	}

	public void setNote(ArrayList<Integer> note) {
		this.note = note;
	}

	

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", note=" + note + ", getNom()="
				+ getNom() + ", getPrenom()=" + getPrenom() + ", getCin()=" + getCin() + ", getNote()=" + getNote()
				+ ", getMoyenne()=" + getMoyenne() + ", getResultat()=" + getResultat() + "]";
	}

	public float getMoyenne() {
		float moy = 0;
		for (int i = 0; i < note.size(); i++) {
			moy += note.get(i);
		}
		return moy / note.size();
	}

	public String getResultat() {
		if (getMoyenne() < 10) {
			return "refuseé";
		} else {
			if (getMoyenne() < 14) {
				return "admis avec mention passable";

			} else {
				if (getMoyenne() < 16) {
					return "admis avec mention bien";

				}else {
						return "admis avec mention tres bien";
				}
			}
		}
	}
}
