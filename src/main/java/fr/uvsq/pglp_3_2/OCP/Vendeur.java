package fr.uvsq.pglp_3_2.OCP;

public class Vendeur extends allEmploye {

	final private int base=2000;
	private int commision;
	
	public Vendeur(int commision) {
		this.commision=commision;
	}
	@Override
	public double salaire() {
		return base+commision;
	}

}
