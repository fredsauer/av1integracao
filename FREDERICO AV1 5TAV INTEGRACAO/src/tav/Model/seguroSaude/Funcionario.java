package tav.Model.seguroSaude;

	public class Funcionario 
	{
	
		public int idFuncionario;
		public String nomeFuncionario;
		public String planoSaude;
	
		public Funcionario (int idFuncionario, String nomeFuncionario, String planoSaude) 
		{
			this.idFuncionario = idFuncionario;
			this.nomeFuncionario = nomeFuncionario;
			this.planoSaude = planoSaude;
		}

		public Funcionario() 
		{
		}

		public int getIdFuncionario() 
		{
			return idFuncionario;
		}

		public void setIdFuncionario(int idFuncionario) 
		{
			this.idFuncionario = idFuncionario;
		}

		public String getNomeFuncionario() 
		{
			return nomeFuncionario;
		}

		public void setNomeFuncionario(String nomeFuncionario) 
		{
			this.nomeFuncionario = nomeFuncionario;
		}

		public String getPlanoSaude() 
		{
			return planoSaude;
		}

	public void setPlanoSaude(String planoSaude) 
		{
		this.planoSaude = planoSaude;
		}

	}