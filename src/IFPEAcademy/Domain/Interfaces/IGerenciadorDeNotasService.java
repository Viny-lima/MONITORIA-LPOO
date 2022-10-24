package IFPEAcademy.Domain.Interfaces;

import IFPEAcademy.Domain.Models.Aluno;
import IFPEAcademy.Domain.Models.Disciplina;

public interface IGerenciadorDeNotasService 
{
	public void ExibirHistoricoEscolar(Aluno aluno);
	
	public double CalcularMedia(Aluno aluno, Disciplina disciplina);
	
	public double CalcularMediaDaTurma(Disciplina disciplina);		
	
}
