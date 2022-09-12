package entities;

public class PessoaJuridica extends Pessoa {
	
	private long cnpj;

	public PessoaJuridica(String nome, float rendaPessoa, TipoSituacao sitPessoa, long cnpj) {
		super(nome, rendaPessoa, sitPessoa);
		
		this.cnpj = cnpj;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + "]";
	}
	
	

}
