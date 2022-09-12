package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movimento {
	private TipoMovimento tipo;
	private LocalDate dataMovimentacao;
	private LocalTime horaMovimentacao;
	private float valMovimentacao;
	
	public Movimento(TipoMovimento tipo, LocalDate dataMovimentacao, LocalTime horaMovimentacao,
			float valMovimentacao) {
		super();
		this.tipo = tipo;
		this.dataMovimentacao = dataMovimentacao;
		this.horaMovimentacao = horaMovimentacao;
		this.valMovimentacao = valMovimentacao;
	}

	public TipoMovimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimento tipo) {
		this.tipo = tipo;
	}

	public LocalDate getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(LocalDate dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public LocalTime getHoraMovimentacao() {
		return horaMovimentacao;
	}

	public void setHoraMovimentacao(LocalTime horaMovimentacao) {
		this.horaMovimentacao = horaMovimentacao;
	}

	public float getValMovimentacao() {
		return valMovimentacao;
	}

	public void setValMovimentacao(float valMovimentacao) {
		this.valMovimentacao = valMovimentacao;
	}

	@Override
	public String toString() {
		return "Movimento [tipo=" + tipo + ", dataMovimentacao=" + dataMovimentacao + ", horaMovimentacao="
				+ horaMovimentacao + ", valMovimentacao=" + valMovimentacao + "]";
	}
}
