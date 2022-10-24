package IFPEAcademy.Domain.Models;

import java.util.List;

public class Professor extends Servidor
{	
	private List<Disciplina> Disciplinas;

	public List<Disciplina> getDisciplinas() {
		return Disciplinas;
	}

	public void AddDiciplina(Disciplina disciplinas) 
	{
		Disciplinas.add(disciplinas);
	}
}
