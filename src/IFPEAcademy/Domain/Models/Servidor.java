package IFPEAcademy.Domain.Models;

public class Servidor extends Pessoa 
{
	private String cod_Servidor;
	private double salario;	
	private String cargo;
	
	
	public String getCod_Servidor() {
		return cod_Servidor;
	}
	public void setCod_Servidor(String cod_Servidor) {
		this.cod_Servidor = cod_Servidor;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
