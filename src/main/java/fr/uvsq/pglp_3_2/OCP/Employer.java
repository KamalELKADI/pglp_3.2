package fr.uvsq.pglp_3_2.OCP;

public class Employer extends allEmploye {

	final private int salaire=1500;
	private int startYear;
	
	public Employer(int startYear) {
		this.startYear=startYear;
	}

	@Override
	public double salaire() {
		return salaire+(2020-this.startYear)*20;
	}
	
}
