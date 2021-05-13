package herança;

import java.util.Date;

public class Gerente extends Funcionario{
	
	private double sal_gerente;
	private String ger_responsável;
	private double sal_vendendor;
	
	public Gerente(String nome, String cpf, Date data_nascimento) {
		super(nome, cpf, data_nascimento);
	}
	
	public void setDados( int num_vendas_vendedor, String resp_vendendor) {
		this.sal_gerente = num_vendas_vendedor * 1350;
		this.ger_responsável = resp_vendendor;
		this.sal_vendendor    = num_vendas_vendedor * 753;
	}
	
	public String toStringPessoa() {
		return "nome = " + nome + " CPF = " + cpf + " Data de Nascimento = " + data_nascimento; 
		
	}
	
	@Override
	public String toString() {
		return "Salário do Gerente = " + sal_gerente + " Resp. pelo vendendor = " + ger_responsável + " Salario vendendor = "
				+ sal_vendendor;
	}
	
	

}
