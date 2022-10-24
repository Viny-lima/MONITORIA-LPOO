package IFPEAcademy.Domain.Interfaces;

import java.util.List;

import IFPEAcademy.Domain.Models.Servidor;

public interface IServidoresService 
{
	public double CalcularMediaSalarial(List<Servidor> servidores);
	
	public double CadastrarServidorNoSistema(Servidor servidor);
	
	public double ExibirListaDeServidores();
	
}
