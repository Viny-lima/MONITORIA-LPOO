package IFPEAcademy.Domain.Models;

import java.util.List;

public class Disciplina 
{
	private String codDaDisciplina;
	private double quantidadeDeHoras;
	private Professor professor;
	private List<Aluno> aluno;
	
	public String getCodDaDisciplina() {
		return codDaDisciplina;
	}
	public void setCodDaDisciplina(String codDaDisciplina) {
		this.codDaDisciplina = codDaDisciplina;
	}
	public double getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}
	public void setQuantidadeDeHoras(double quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

}
