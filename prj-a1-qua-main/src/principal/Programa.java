package principal;

import principal.modelo.*;
import principal.daos.*;

public class Programa {
	
	public static void main(String[] args) {
		
		PacienteDAO pdao = new PacienteDAO();
		
		Paciente p = new Paciente("Ana", "PX0458");
		
		pdao.salvar(p);
		
		MedicamentoDAO mdao = new MedicamentoDAO();
		
		Medicamento m1 = new Medicamento("Benztropina", p);
		Medicamento m2 = new Medicamento("Metocarbamol", p);
		Medicamento m3 = new Medicamento("Benegripe", p);
		
		mdao.salvar(m1);
		mdao.salvar(m2);
		mdao.salvar(m3);
		
		p.addMed(m1);
		p.addMed(m2);
		p.addMed(m3);

		pdao.atualizar(p);
		
		pdao.close();
		mdao.close();
		

		
	}
}
