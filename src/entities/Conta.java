package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Conta {

	private long numeroConta;
	private LocalDate dataAbertura;
	private LocalDate dataEncerramento;
	private TipoSituacao situacao;
	private String senha;
	private Double saldo;
	private Pessoa pessoa;
	private List<Movimento> movimentos = new ArrayList<>();
	
	public Conta(long numeroConta, LocalDate dataAbertura, TipoSituacao situacao, String senha,
			Double saldo, Pessoa pessoa) {
		super();
		this.numeroConta = numeroConta;
		this.dataAbertura = dataAbertura;
		this.situacao = situacao;
		this.senha = senha;
		this.saldo = saldo;
		this.pessoa = pessoa;
	}
	
	public List<Movimento> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(List<Movimento> movimentos) {
		this.movimentos = movimentos;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(LocalDate dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public TipoSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(TipoSituacao situacao) {
		this.situacao = situacao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", dataAbertura=" + dataAbertura + ", dataEncerramento="
				+ dataEncerramento + ", situacao=" + situacao + ", senha=" + senha + ", saldo=" + saldo + "]";
	}
	
	public void depositar(Double valor) {
		if(valor > 0) {
			this.saldo += valor;
			Movimento movimento = new Movimento(TipoMovimento.DEPOSITAR, LocalDate.now(), LocalTime.now(), valor.floatValue());
			movimentos.add(movimento);
		}
	}
	
	public void sacar(Double valor) {
		if(valor > 0) {
			this.saldo -= valor;
			Movimento movimento = new Movimento(TipoMovimento.SACAR, LocalDate.now(), LocalTime.now(), valor.floatValue());
			movimentos.add(movimento);
		}
	}
	
	public void transferir (Double valor, Conta contaNova) {
		this.sacar(valor);
		contaNova.depositar(valor);
		Movimento movimento = new Movimento(TipoMovimento.TRANSFERIR, LocalDate.now(), LocalTime.now(), valor.floatValue());
		movimentos.add(movimento);
	}
	
	public static void main (String [] args) {
		
//		Conta conta = new Conta(00001, LocalDate.of(2020, 01,10), Situacao.ATIVA, "1234", 100.00;
	//	System.out.println(conta);
	}
}
