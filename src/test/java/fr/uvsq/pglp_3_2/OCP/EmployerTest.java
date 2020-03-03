package fr.uvsq.pglp_3_2.OCP;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployerTest {

	 @Test
	    public void Salaire() {
	        Vendeur v1 = new Vendeur(10);
	        Vendeur v2 = new Vendeur(20);
	        Employer e1 = new Employer(2003);
	        Employer e2 = new Employer(2010);
	        ArrayList<allEmploye> listEmploye= new ArrayList<allEmploye>();
	        listEmploye.add(e1);
	        listEmploye.add(e2);
	        listEmploye.add(v1);
	        listEmploye.add(v2);
	        listEmploye.add(new Manager(20));
	        double salaireTotal=0;
	        for (int i = 0; i < listEmploye.size(); i++) {
				salaireTotal += listEmploye.get(i).salaire();
			}
	        System.out.println("salaire total : " + salaireTotal);
	       
	    }
}
