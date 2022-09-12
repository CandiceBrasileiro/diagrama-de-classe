package entities;

public class PessoaFisica extends Pessoa {

	private long cpf;
	private long rg;
	
	public PessoaFisica(String nome, float rendaPessoa, TipoSituacao sitPessoa, long cpf, long rg) {
		super(nome, rendaPessoa, sitPessoa);
		
		this.cpf = cpf;
		this.rg = rg;		
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + "]";
	}

	
	
}
