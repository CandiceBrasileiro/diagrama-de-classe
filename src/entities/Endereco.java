package entities;

public class Endereco {
	
	private String rua;
	private long cep;
	private String bairro;
	private int numero;
	private String cidade;
		
	public Endereco(String rua, long cep, String bairro, int numero, String cidade) {
		super();
		this.rua = rua;
		this.cep = cep;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cep=" + cep + ", bairro=" + bairro + ", numero=" + numero + ", cidade="
				+ cidade + "]";
	}

}
