package teste.seguroSaude;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import tav.Interfaces.planoSaude.IMedico;
import tav.Model.planoSaude.Agendamento;
import tav.Model.planoSaude.Funcionario;
import tav.Model.planoSaude.Medico;

public class AgendamentoUnitTest 
	{
	@Test

	public void ValidaCRM()
	{
		// ARRANGE !!!
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "CONSULTA", 0, "RUA CARMEM MIRANDA, 39 MEIER, RJ","2021/01/12", "08:30");
		boolean esperado = false;
		IMedico medico = new Medico();		
        	when(mockMedico.ValidaCRM(medico)).thenReturn(true);
		
        	// ACT !!!
        	var resultado = agendar.ValidaCRM(medico);

       		// ASSERT !!!
        	assertEquals(resultado, esperado);
	}
	
	@Test

	public void ValidaEnderecoPorCRM() 
	{
		// ARRANGE !!!
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "EXAME", 1, "RUA CARMEM MIRANDA, 39, MEIER, RJ", "2021/01/12", "10:30");
		boolean esperado = true;
		IMedico medico = new Medico();	
     		when(mockMedico.ValidaEndereco(medico)).thenReturn(true);
		
        	// ACT !!!
        	var resultado = agendar.ValidaEndereco(medico);

        	// ASSERT !!!
        	assertEquals(resultado, esperado);
	}
	
	@Test

	public void ValidaDataPorEndereco() 
	{
		// ARRANGE !!!
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "EXAME", 1, "RUA CARMEM MIRANDA, 39, MEIER, RJ", "2021/02/02", "08:30");
		boolean esperado = false;
		IMedico medico = new Medico();		
		when(mockMedico.ValidaDataPorEndereco(medico)).thenReturn(true);
				
		// ACT !!!
		var resultado = agendar.ValidaDataPorEndereco(medico);

        	// ASSERT !!!
        	assertEquals(resultado, esperado);
	}
	
	@Test

	public void ValidaHoraPorData() 
	{
		// ARRANGE !!!
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "CONSULTA", 1, "RUA CARMEM MIRANDA, 39, MEIER, RJ", "2021/02/02", "08:30");
		boolean esperado = true;
		IMedico medico = new Medico();		
		when(mockMedico.ValidaHoraPorData(medico)).thenReturn(true);
				
		// ACT !!!
		var resultado = agendar.ValidaHoraPorData(medico);

        	// ASSERT !!!
        	assertEquals(resultado, esperado);
	}
	
	@Test

	public void TestCarteirinha() 
	{
		// ARRANGE !!!
		Agendamento agendar = new Agendamento();
		Funcionario funcionario1 = new Funcionario(1, "OSWALDO", "ESPECIAL");
		String esperado = "ID:" + funcionario1.getIdFuncionario() + "\n" + "NOME:" + funcionario1.getNomeFuncionario() 
		+ "\n" + "CONVENIO:" + funcionario1.planoSaude;
		
								
		// ACT !!!
		String resultado = agendar.carteirinhaPlano(1, "OSWALDO", "ESPECIAL");
		
		// ASSERT !!!
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void ValidaCobertura() 
	{
		Agendamento agendar = new Agendamento(0, 0, "CONSULTA", 1, "RUA CARMEM MIRANDA, 39, MEIER, RJ", "2021/02/01", "09:00");
		boolean esperado = false;
		Funcionario funcionario1 = new Funcionario(2, "ADRIANA", "EXAME");
				
		// ACT !!!
		var resultado = agendar.ValidaCobertura(funcionario1.planoSaude);
		
		// ASSERT !!!
		assertEquals(resultado, esperado);
	}
}