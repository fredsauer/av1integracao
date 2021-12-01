package tav.Model.seguroSaude;

import java.util.ArrayList;

import tav.Interfaces.seguroSaude.IMedico;

public class Medico implements IMedico 
	{
		public String name;
		public String area;
		public Integer CRM;
		public Enderecos address;

		ArrayList<Enderecos> endereco = new ArrayList<>();
    
		ArrayList<Medico> medico = new ArrayList<>();
	
		public Medico(String name, String area, Integer CRM, Enderecos address) 
		{
        		this.name = name;
        		this.area = area;
			this.CRM = CRM;
        		this.address = address;
		}

		public void adicionarMedico(String name, String area, Integer CRM, Enderecos address) 
		{
        		this.medico.add(new Medico(CRM, name, area, address));
        		this.setCRM(CRM);
        		this.setName(name);
        		this.setArea(area);
        		this.endereco.add(address);
        		this.setAddress(address); 
		}

		public ArrayList<Medico> getMedicos() 
		{
        		return medico;
		}

		public void adicionarEndereco(Enderecos address) 
		{
        		this.endereco.add(address);
        		setAddress(address);
		}

		public String toString() 
		{
        		return String.format("\nPROFISSIONAL: %s\nCRM: %d\nAREA: %s\n%s",
        		getName(), getCRM(), getArea(), getAddress());
		}

		public void setName(String name) 
		{
        		this.name = name;
		}

		public void setCRM(Integer CRM) 
		{
        		this.CRM = CRM;
		}

		public void setArea(String area) 
		{
        		this.area = area;
		}

		public void setAddress(Enderecos address) 
		{
        		this.address = address;
		}

		public Integer getCRM() 
		{
        		return this.CRM;
		}

		public String getName() 
		{
        		return this.name;
		}

		public String getArea() 
		{
        		return this.area;
		}

		public Enderecos getAddress() 
		{
        		return address;
		}

		public boolean ValidaEndereco(IMedico medico) 
		{
			return true;
		}

		public boolean ValidaHoraPorData(IMedico medico) 
		{
				return true;
		}
	
	
		public boolean ValidaDataPorEndereco(IMedico medico) 
		{
			return true;
		}

		public boolean ValidaCRM (IMedico medico)
		{
			return true;
		}
	}