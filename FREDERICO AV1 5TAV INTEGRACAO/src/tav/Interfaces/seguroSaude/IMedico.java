package tav.Interfaces.seguroSaude;

public interface IMedico 
	{
	public boolean ValidaEndereco(IMedico medico);
	public boolean ValidaHoraPorData(IMedico medico);
	public boolean ValidaDataPorEndereco(IMedico medico);
	public boolean ValidaCRM (IMedico medico);
	}