package entities;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	private long numero;
	private List<Conta> contas = new ArrayList<>();
	
	public Agencia(long numero) {
		super();
		this.numero = numero;
	}
	
	public Agencia() {
		super();
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public void CadastrarConta(Conta conta) {
		this.contas.add(conta);
	}
}
