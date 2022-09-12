package entities;

public class Pessoa {

	private String nome;
	private float rendaPessoa;
	private TipoSituacao sitPessoa;
	private Endereco endereco;
	
	public Pessoa(String nome, float rendaPessoa, TipoSituacao sitPessoa) {
		super();
		this.nome = nome;
		this.rendaPessoa = rendaPessoa;
		this.sitPessoa = sitPessoa;
	}
	
	public Pessoa(String nome, float rendaPessoa, TipoSituacao sitPessoa, Endereco endereco) {
		super();
		this.nome = nome;
		this.rendaPessoa = rendaPessoa;
		this.sitPessoa = sitPessoa;
		this.endereco = endereco;
	}
	
	public Pessoa() {
		super();
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getRendaPessoa() {
		return rendaPessoa;
	}
	public void setRendaPessoa(float rendaPessoa) {
		this.rendaPessoa = rendaPessoa;
	}
	public TipoSituacao getSitPessoa() {
		return sitPessoa;
	}
	public void setSitPessoa(TipoSituacao sitPessoa) {
		this.sitPessoa = sitPessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rendaPessoa=" + rendaPessoa + ", sitPessoa=" + sitPessoa + ", endereco="
				+ endereco + "]";
	}
}
