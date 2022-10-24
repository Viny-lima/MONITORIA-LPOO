package IFPEAcademy.Domain.Interfaces;

import IFPEAcademy.Domain.Models.Disciplina;

public interface IDisciplinaService 
{
	public void AddDisciplina(Disciplina disciplina);
	
	public void DeletarDiciplina(Disciplina disciplina);
	
	public void ExibirInformacaoesDaDisciplina(Disciplina disciplina);
	
	public void ExbirTodasAsDisciplinas();
	
}
