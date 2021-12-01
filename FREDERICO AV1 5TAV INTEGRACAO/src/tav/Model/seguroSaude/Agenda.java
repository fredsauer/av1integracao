package tav.Model.seguroSaude;

import java.util.ArrayList;
import java.util.List;

public class Agenda 
	{

	Medico medicos = new Medico();
    
	List<String> hour1 = new ArrayList<>();
	Enderecos endereco1 = new Enderecos();
	DateTime date1 = new DateTime("2021/01/12", hour1);
    
	Medico AddAgenda1() 
	{      
        date1.AddHour("08:30");
        date1.AddHour("10:30"); 
        
        endereco1.adicionarEnderecos("RUA CARMEM MIRANDA, 39, MEIER, RJ", date1);
        medicos.adicionarMedico(1, "DR MARCOS CORREA", "OFTALMOLOGIA", endereco1);
		
        return medicos;
	}
    
   	DateTime getDate1() 
	{
    	return date1;
	}
    
    Enderecos getEndereco1() 
	{
    	return endereco1; 
	}
	}