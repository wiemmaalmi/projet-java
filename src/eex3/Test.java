package eex3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList<Integer>(); 
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.add(14);
		a1.add(17);
		Etudiant e1=new Etudiant("hatem","slimani",11609700,a1);
		ArrayList a2=new ArrayList<Integer>(); 
		
		a2.add(10);
		a2.add(12);
		a2.add(13);
		a2.add(15);
		a2.add(16);
		Etudiant e2=new Etudiant("letaief","mabrouk",45215,a2);
		System.out.println(e1.getMoyenne());
		ArrayList<Etudiant> etdlist=new ArrayList<>();
		etdlist.add(e1);
		etdlist.add(e2);
		Section s1=new Section(1,etdlist);
		System.out.println(s1.toString());		
		Amine amine =new Amine();
	}

}
