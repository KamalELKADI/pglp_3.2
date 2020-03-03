package fr.uvsq.pglp_3_2.OCP;

public class Manager extends allEmploye {

	private final int base=1500;
	private int nbrEmploye;
	
	public Manager(int nbrEmploye) {
		this.nbrEmploye = nbrEmploye;
	}
	
	@Override
	public double salaire() {
		
		return base + (nbrEmploye*100);
	}

}
